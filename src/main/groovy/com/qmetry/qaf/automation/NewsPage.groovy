package com.qmetry.qaf.automation

import geb.Page

class NewsPage extends Page {

	//static url = "http://www.jcpenney.com/"

	static at = { selectItem.displayed }

	static content = {
		selectItem (wait: true){ $("div.jcp-carousel-view ul li .jcp-prod-recommended-details a")[0] }
//		news { $("#orderQuantity") }
//		categoryLink { title -> $(("div.holder").$("ul li a"))[0] }
	//	news { $("div.holder").$("ul li a") } div.jcp-carousel-view").find("a
	}

	/**
	 * Selects the specified category
	 * 
	 * @param category the category to select
	 * @return the news category page
	 */
	def check_item()
	{
		selectItem.click();

	}
	
	/*NewsCategoryPage selectCategory(String category) {
		println category
		categoryLink(category).click()
		browser.page(new NewsCategoryPage(category: category))
	}*/
}
