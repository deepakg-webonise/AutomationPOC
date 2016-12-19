package com.qmetry.qaf.automation

import geb.Browser
import geb.binding.BindingUpdater
import groovy.transform.CompileStatic
import geb.*

import static cucumber.api.groovy.EN.*
import static cucumber.api.groovy.Hooks.*
import java.util.concurrent.TimeUnit

import  com.qmetry.qaf.automation.NewsPage
import com.qmetry.qaf.automation.ui.UiDriverFactory.Browsers
import  com.qmetry.qaf.automation.HomePage

/**
 * Created by Webonise on 13/12/16.
 */
//@CompileStatic
//public class ConsumptionService {
def configbinding{


	  Before() {
		  println("In env under resources !")
		  bindingUpdater = new BindingUpdater(binding, new Browser(baseUrl : "http://www.jcpenney.com/"))
		  bindingUpdater.initialize()
		  browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
		  browser.driver.manage().window().maximize()
	  }
   After(){ bindingUpdater.remove() }
}