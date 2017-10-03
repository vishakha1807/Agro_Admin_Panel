package com.agro;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
 * this is the class for initialize login-page,home-page and browser factory objects
 */
public class TestCase 
{
	
	WebDriver driver;
	Login_Page login;
	HomePage homepage;
	
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
		report=new ExtentReports("/home/mubashir/Desktop/test.html",true);
		
		//get driver factory object to get chrome browser to start
		driver = BrowserFactory.getBrowser("chrome");
		
	}
	
/***************************************************************************************
* 
* 						Test Section
* 		This section contains all the tests that are to be run as part of this test suite
* 
******************************************************************************************/	

	/*
	 * this is a test case to check whether image is displayed or not
	 */
	@Test(priority = 1)
	public void test1() throws InterruptedException
	{
		
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//calling method to highlight the Image
		fnHighlightMe(driver,LoginElements.loginImage(driver));
		
		//Calling the method of Login_Page class to check whether image is displayed or not
 	    login.checkImageIsDisplaying();
 	    
 	    //From here test is start to be written in Extent Report
	    logger=report.startTest("Logo Image Is Displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	}
 
	/*
	 * this is a test case to check whether Logo of Agro is displayed or not
	 */
	@Test(priority = 2)
	public void test2() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,LoginElements.agro_logo(driver));
		
		//Calling the method of Login_Page class to check whether logo of Agro is displayed or not
		login.checkAgroLogoIsDisplaying();
		logger=report.startTest("Agro Logo Is Displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
 
	/*
	 * this is a test case to check whether Text Header(H1) is displayed or not
	 */	
	@Test(priority = 3)
	public void test3() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,LoginElements.header1(driver));
		//Calling the method of Login_Page class to check whether Text Header(H1) is displayed or not
		login.verifyTextH1();
		logger=report.startTest("Text header-H1 is displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
 
	/*
	 * this is a test case to check whether Text Header(H2) is displayed or not
	 */
	@Test(priority = 4)
	public void test4() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,LoginElements.header2(driver));
		//Calling the method of Login_Page class to check whether Text Header(H2) is displayed or not
		login.verifyTextH2();
		logger=report.startTest("Text header-H2 is displayed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}

	/*
	 * this is a test case to call the login method and passing argument to the method
	 */
	@Test(priority = 5)
	public void test5() throws InterruptedException
	{
		// Creating the object of Login_Page class
		login = new Login_Page(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,LoginElements.username(driver));
		fnHighlightMe(driver,LoginElements.password(driver));
		//Calling the method of Login_Page and passing the arguments to it
		login.loginToAgro("admin@gmail.com", "password");
		logger=report.startTest("passing arguments to login credentials");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}

	/*
	 * this is the method to clicking on login button
	 */
	@Test(priority = 6)
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

	/*
	 * this is a test case to check login is successful or not
	 */
	@Test(priority = 7)
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
	
	/*
	 * this is a test case to check allow location pop-up is displaying or not
	 */
	@Test(priority = 8)
	public void test8() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.location_PopUp(driver));
		//Calling the method of HomePage class to check allow location pop-up is displaying or not
		homepage.allowLoaction();
		Thread.sleep(5000);
		logger=report.startTest("Allowed location successfully");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check top menu bar is exist or not
	 */
	@Test(priority = 9)
	public void test9() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.topMenuBar(driver));
		//Calling the method of homePage class to check top menu bar is exist or not
		homepage.verifyTopMenu();
		logger=report.startTest("Top Menu bar exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether logo of agro is displayed or not
	 */
	@Test(priority = 10)
	public void test10() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.logo_of_agro(driver));
		//Calling the method of home-page to check whether logo of agro is displayed or not	
		homepage.verifyAgroLogo();
		logger=report.startTest("Agro logo is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether Hamburger Menu is displayed or not
	 */
	@Test(priority = 11)
	public void test11() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.hamburgerMenu(driver));
		//Calling the method of HomePage class to check whether Hamburger Menu is displayed or not	
		homepage.isHamburgerMenuExist();
		logger=report.startTest("Hamburger menu is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether search icon is displayed or not
	 */
	@Test(priority = 12)
	public void test12() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.searchButton(driver));
		//Calling the method of HomePage class to check whether search icon is displayed or not
		homepage.isSearchIconExist();
		logger=report.startTest("Search Icon is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether search bar is displayed or not
	 */
	@Test(priority = 13)
	public void test13() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.searchBar(driver));
		//Calling the method of HomePage class to check whether search bar is displayed or not
		homepage.isSearchBarExist();
		logger=report.startTest("Search Bar is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether location field is displayed or not	
	 */
	@Test(priority = 14)
	public void test14() throws InterruptedException
	{
		// Creating the object of Home-page class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.getLocationfield(driver));
		//Calling the method of HomePage class to check whether location field is displayed or not	
		homepage.isLocationFieldExist();
		logger=report.startTest("Location field is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether message box is displayed or not	
	 */
	@Test(priority = 15)
	public void test15() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.messageField(driver));
		//Calling the method of HomePage class to check whether message box is displayed or not	
		homepage.isMessageFieldExist();
		logger=report.startTest("Message field is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether report field is displayed or not
	 */
	@Test(priority = 16)
	public void test16() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.reportsField(driver));
		//Calling the method of HomePage class to check whether report field is displayed or not
		homepage.isReportsFieldExist();
		logger=report.startTest("Report field is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether logout button is displayed or not
	 */
	@Test(priority = 17)
	public void test17() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.logoutButton(driver));
		//Calling the method of HomePage class to check whether logout button is displayed or not	
		homepage.islogoutButtonExist();
		logger=report.startTest("Logout button is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether profile picture is displayed or not
	 */
	@Test(priority = 18)
	public void test18() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.profilePic(driver));
		//Calling the method of HomePage class to check whether profile picture is displayed or not
		homepage.isprofilePicExist();
		logger=report.startTest("Profile Pic is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether user name is displayed or not
	 */
	@Test(priority = 19)
	public void test19() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.userName(driver));
		//Calling the method of HomePage class to check whether user name is displayed or not
		homepage.isUserNameExist();
		logger=report.startTest("User Name is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether user designation is displayed or not
	 */
	@Test(priority = 20)
	public void test20() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.userDesignation(driver));
		//Calling the method of HomePage class to check whether user designation is displayed or not	
		homepage.isUserDesignationExist();
		logger=report.startTest("User Designation is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether share rate is displayed or not
	 */
	@Test(priority = 21)
	public void test21() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.shareRate(driver));
		//Calling the method of HomePage class to check whether share rate is displayed or not
		homepage.isshareRateExist();
		logger=report.startTest("Share Rate is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to check whether rate text is displayed or not
	 */
	@Test(priority = 22)
	public void test22() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		
		//calling method to highlight the web-element
		fnHighlightMe(driver,HomePage_Elements.rateText(driver));
		//Calling the method of HomePage class to check whether rate text is displayed or not
		homepage.isRateTextExist();
		logger=report.startTest("Rate text is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to list the items of side menu
	 */
	@Test(priority = 23)
	public void test23() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to list the items of side menu
		homepage.menuItemsList();
		logger=report.startTest("Rate text is exist on homepage");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll the webpage
	  	jse.executeScript("window.scrollBy(0,500)", "");
	    
	}
	
	/*
	 * this is a test case to verify that Income card is exist or not
	 */
	@Test(priority = 24)
	public void test24() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.incomeCard(driver));
		//Calling the method of HomePage class to verify that Income card is exist or not
		homepage.isIncomeCardExist();
		logger=report.startTest("Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to verify that User Registration card is exist or not
	 */
	@Test(priority = 25)
	public void test25() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.userRegistrationCard(driver));
		//Calling the method of HomePage class to verify that User Registration card is exist or not
		homepage.isuserRegistrationCardExist();
		logger=report.startTest("User Registration Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to verify Farmer Registration card is exist or not
	 */
	@Test(priority = 26)
	public void test26() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.farmerRegistrationCard(driver));
		//Calling the method of HomePage class to verify Farmer Registration card is exist or not
		homepage.isfarmerRegistrationCardExist();
		logger=report.startTest("Farmer Registration Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to verify Order Income Card is exist or not
	 */
	@Test(priority = 27)
	public void test27() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.orderIncomeCard(driver));
		//Calling the method of HomePage class to verify Order Income Card is exist or not
		homepage.isorderIncomeCardExist();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get default value of income from income card
	 */
	@Test(priority = 28)
	public void test28() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.defaultIncome(driver));
		//Calling the method of HomePage class to get default value of income from income card
		homepage.getDefaultValueOfIncomeCard();
		logger=report.startTest("Default value of income is printed");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get default value of user registrations from user registration card
	 */
	@Test(priority = 29)
	public void test29() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.defaultUserRegistration(driver));
		//Calling the method of HomePage class to get default value of user registrations from user registration card
		homepage.getDefaultValueOfUserRegCard();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get default value of farmer registrations from farmer registration card
	 */
	@Test(priority = 30)
	public void test30() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.defaultFarmerRegistration(driver));
		//Calling the method of HomePage class to get default value of farmer registrations from farmer registration card
		homepage.getDefaultValueOfFarmerRegCard();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get default value of order income from order income card	
	 */
	@Test(priority = 31)
	public void test31() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.defaultOrderIncome(driver));
		//Calling the method of HomePage class to get default value of order income from order income card	
		homepage.getDefaultValueOfOrderIncomeCard();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get the income by passing different-2 parameter
	 */
	@Test(priority = 32)
	public void test32() throws InterruptedException
	{
		// Creating the object of Home-page class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to get the income by passing different-2 parameter
		homepage.getIncomeByIndex();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get the user registration by passing different-2 parameter
	 */
	@Test(priority = 33)
	public void test33() throws InterruptedException
	{
		// Creating the object of Home-page class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to get the income by passing different-2 parameter
		homepage.getuserByIndex();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get the farmer registration by passing different-2 parameter
	 */
	@Test(priority = 34)
	public void test34() throws InterruptedException
	{
		// Creating the object of Home-page class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to get the income by passing different-2 parameter
		homepage.getFarmerByIndex();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * this is a test case to get the order income by passing different-2 parameter
	 */
	@Test(priority = 35)
	public void test35() throws InterruptedException
	{
		// Creating the object of Home-page class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to get the income by passing different-2 parameter
		homepage.getOrderIncomeByIndex();
		logger=report.startTest("Order Income Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll the webpage
	  	jse.executeScript("window.scrollBy(0,300)", "");
	    
	}
	
	/*
	 * this is a test case to verify Activity card is exist or not
	 */
	@Test(priority = 36)
	public void test36() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		fnHighlightMe(driver,HomePage_Elements.activityCard(driver));
		//Calling the method of HomePage class to verify activity card is exist or not
		homepage.isActivityCardExist();
		logger=report.startTest("Activity Card Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * This method is to find the details of yukon gold and verify that clicking on yukon gold 
	 * it is moving to next page or not
	 */	
	@Test(priority = 37)
	public void test37() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to verify existence of yukon gold
		homepage.is_Yukon_Gold_Exist();
		logger=report.startTest("Yukon Gold Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * This method is to find the details of quajava Crema and verify that clicking on quajava Crema
	 * it is moving to next page or not
	 */	
	@Test(priority = 38)
	public void test38() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to verify existence of quajava Crema
		homepage.is_Quajava_Crema_Exist();
		logger=report.startTest("Quajava Crema Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * This method is to find the details of mortgage Lifter and verify that clicking on mortgage Lifter
	 * it is moving to next page or not
	 */	
	@Test(priority = 39)
	public void test39() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to verify existence of quajava Crema
		homepage.is_Mortgage_Lifter_Exist();
		logger=report.startTest("Mortgage Lifter Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * This method is to find the details of Malus Pumila Apple and verify that clicking on Malus Pumila Apple
	 * it is moving to next page or not
	 */	
	@Test(priority = 40)
	public void test40() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to verify existence of Malus Pumila Apple
		homepage.is_Malus_Pumila_Apple_Exist();
		logger=report.startTest("Malus Pumila Apple Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	
	/*
	 * This method is to find the details of Blood Orange and verify that clicking on Blood Orange
	 * it is moving to next page or not
	 */	
	@Test(priority = 41)
	public void test41() throws InterruptedException
	{
		// Creating the object of Homepage class
		homepage = new HomePage(driver);
		//Calling the method of HomePage class to verify existence of Blood Orange
		homepage.is_Blood_Orange_Exist();
		logger=report.startTest("Blood Orange Exist");
	  	Assert.assertTrue(true);
	  	logger.log(LogStatus.PASS, "test pass");
	  	report.endTest(logger);
	    
	}
	/*
	 * This is the method to highlight the web-elements
	 */
	public static void fnHighlightMe(WebDriver driver,WebElement element) throws InterruptedException{
		  //Creating JavaScriptExecuter Interface
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 3; iCnt++) {
		   //Execute javascript
		         js.executeScript("arguments[0].style.border='4px groove green'", element);
		         Thread.sleep(1000);
		         js.executeScript("arguments[0].style.border=''", element);
		   }
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
		//it is used to stop writing  in report
		report.flush();
		
		//it is used for closing the report
		report.close();	
		
		//it is used to close the browser
		driver.quit();
	}
	
	
}

