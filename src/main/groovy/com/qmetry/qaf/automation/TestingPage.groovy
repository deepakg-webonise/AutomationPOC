package com.qmetry.qaf.automation

import geb.Page

class TestingPage extends Page {
	static URL = "http://www.jcpenney.com/"
	static content = {
		jchome { $(By.xpath("//a[@title='JCPenney Home']")) }  // div.main_logo.flt_lft
		jcorder {$("#orderQuantity")}
	}
	
	def clickhome(){
		at(TestingPage)
		jcorder.click()
	}
	
}
