package com.agro;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;


/**********************************************************************************
 * 
 * 
 * 				Start of the test section
 * 
 * ********************************************************************************/

/*
 * this is the class for initialize login factory and browser factory objects
 */
public class TestCase 
{
	
	WebDriver driver;
	Login_Page login;
	
	//initialize Extent Reports to be used for reporting
	ExtentReports report;
	
	//initialize Extent Reports logger for indicating tests are passed or not.
	ExtentTest logger;
	
	
/***************************************************************************************
* 
* 						Before Test Section
* 		This section runs before any tests are commenced in the browser.
* 
******************************************************************************************/

	@BeforeTest
	public void init()
	{
		
		//initialized the Extent Reports to be put in specific directory.
		report=new ExtentReports("/home/mubashir/Downloads/vishakha/test.html",true);
		
		//get driver factory object to get chrome browser to start
		driver = BrowserFactory.getBrowser("chrome");
		
	}
	
/***************************************************************************************
* 
* 						Test Section
* 		This section contains all the tests that are to be run as part of this test suite
* 
******************************************************************************************/	
	
// this is a test case to check whether image is displayed or not
		
	@Test
	public void test1() throws InterruptedException
	{
		
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to check whether image is displayed or not
 	    login.checkImageIsDisplaying();
 	    
 	    //From here test is start to be written in Extent Report
	    logger=report.startTest("Logo Image Is Displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	}
	
// this is a test case to check whether Logo of Agro is displayed or not
	@Test
	public void test2() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to check whether logo of Agro is displayed or not
		login.checkAgroLogoIsDisplaying();
		logger=report.startTest("Agro Logo Is Displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}

// this is a test case to check whether Text Header(H1) is displayed or not
	
	@Test
	public void test3() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to check whether Text Header(H1) is displayed or not
		login.verifyTextH1();
		logger=report.startTest("Text header-H1 is displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
// this is a test case to check whether Text Header(H2) is displayed or not
	@Test
	public void test4() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to check whether Text Header(H2) is displayed or not
		login.verifyTextH2();
		logger=report.startTest("Text header-H2 is displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
// this is a test case to call the login method and passing argument to the method
	@Test
	public void test5() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page and passing the arguments to it
		login.loginToAgro("admin@gmail.com", "password");
		logger=report.startTest("passing arguments to login credentials");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}

//this is the method to clicking on login button
	@Test
	public void test6() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to click on login button
		login.clickLogin();
		logger=report.startTest("click login button");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	}
	    
//this is a test case to check login is successful or not
	@Test
	public void test7() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//Calling the method of Login_Page class to check login is successful or not
		login.geturl();
		logger=report.startTest("login successful");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
/***************************************************************************************
* 
* 						After Test Section
* 		This section runs after any tests are commenced in the browser.
* 
******************************************************************************************/	
	    	
	@AfterTest
	public void end()
	{
		//
		report.flush();
		
		//it is used for closing the report
		report.close();	
		
		//it is used to close the browser
		driver.quit();
	}
	
	
}

