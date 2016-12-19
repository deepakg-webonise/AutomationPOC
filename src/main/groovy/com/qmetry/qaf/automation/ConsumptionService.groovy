package com.qmetry.qaf.automation

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.*
import geb.Browser
import geb.binding.BindingUpdater

import java.util.concurrent.TimeUnit

import  com.qmetry.qaf.automation.NewsPage
import  com.qmetry.qaf.automation.HomePage



def jcPage
/*
 *
 *  Given I am on the home page
	When I go to my bag
	Then user successfully able to view my bag
 */
//BEfore and after are cucumber hooks
def executeefore()
{
Before() {
	bindingUpdater = new BindingUpdater(binding, new Browser())
	bindingUpdater.initialize()
	browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
	browser.driver.manage().window().maximize()
}
}
After() { bindingUpdater.remove() }

Given(~/^I am on the home page$/) { -> to HomePage }  // to use for navigation to call Home page

When(~/^I go to my bag$/) {
	->
	page.selectLatestNews()
	at NewsPage
	page.check_item()
}

Then(~/^user successfully able to view my bag$/) { -> at HomePage
	
	//String expectedHeading ->
	//assert page.headings[0].text() == expectedHeading
	//page.printmesg()
	
}
/*
When(~/^I select "([^"]*)"$/) {  String category ->
	def newsCategoryPage = page.selectCategory(category)
	at newsCategoryPage
}

When(~/^I select the first video on the 'Watch-Listen' section$/) {
	->
	def selectFirstVideo = page.selectFirstVideo()
	at selectFirstVideo
}

When(~/^I share the video page on facebook$/) {
//	-> fbPage = page.shareOnFacebook()
}*/



s