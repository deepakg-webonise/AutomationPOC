package com.qmetry.qaf.automation;

import com.qmetry.qaf.automation.step.QAFTestStep;
import cucumber.annotation.After;
import cucumber.annotation.Before;

import groovy.lang.Binding;
//import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import groovy.util.GroovyScriptEngine;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

import com.qmetry.qaf.automation.ConsumptionService;
import com.qmetry.qaf.automation.TestingPage;

/**
 * Created by Webonise on 14/12/16.
 */

public class Entry {

	/*
    public static void main(String[] args){
        ConsumptionService c = new ConsumptionService();
        c.sayHello();
    }
    */
    
     /*
	 String[] paths = {"C:\\Users\\webonise\\git\\qaf-groovy\\qaf-groovy-integration\\src\\main\\groovy\\com\\qmetry\\qaf\\automation"};
		  GroovyScriptEngine gse = new GroovyScriptEngine(paths);
		  Binding binding = new Binding();
		  Object[] path = {"C:\\Users\\webonise\\git\\qaf-groovy\\qaf-groovy-integration"};
		  binding.setVariable("args",path);
		  
		  gse.run("Songs.groovy", binding); */
	
	
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	
	@Before
	public void beforeScenario()
	{
		System.out.println("---------------------------before------------------------------");
	}
			
	
	@QAFTestStep(description = "I am on the home page")
	public static void searchFor() {
		ConsumptionService c = new ConsumptionService();
      // c.executebefore();
       TestingPage tp = new TestingPage();
       tp.clickhome();
	//	 c.executebefore();
	 //    c.userhome();
	  //   c.executeafter();
	
	}
	
	
	@QAFTestStep(description="I go to my bag")
	public void sendkeysTo(){
	
		System.out.println("In when--entryjava file  ");
		ConsumptionService c = new ConsumptionService();
	       c.executeefore();
	   //    TestingPage tp = new TestingPage();
	 
	   //    tp.clickhome();
	//	ConsumptionService c = new ConsumptionService();
		//c.goHomepage();
	//	c.userhome();
	
	}
	
	@QAFTestStep(description="user successfully able to view my bag")
	public void thencheck(){
	
		System.out.println("then---entry java file ");
		
	
	}
}
