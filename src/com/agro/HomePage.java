package com.agro;

import org.openqa.selenium.WebDriver;

/*********************************************************************************************
 * 
 * this is the class for initializing all the methods to check functionality of home-page elements
 * This class extends the class HomePage_Elements
 *
 *************************************************************************************************/

public class HomePage extends HomePage_Elements
{
	WebDriver driver;
	
	/*
	 * This is the constructor of this class to initializing WebDriver
	 */
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * This is the method to check whether pop up of location is displayed or not	
	 */
	public void allowLoaction()
	{
		HomePage_Elements.location_PopUp(driver).click();
	}
	
	/*
	 * This is the method to check whether top menu bar is displayed or not	
	 */
	public void verifyTopMenu()
	{
		//using if-else condition to verify whether top menu bar is displayed or not
		if(HomePage_Elements.topMenuBar(driver).isDisplayed())
		{
			System.out.println("Top Menu bar is exist");
		}
		else
		{
			System.out.println("Top Menu bar is not exist");
		}
	}
	
	/*
	 * This is the method to check whether logo of agro is displayed or not	
	 */
	public void verifyAgroLogo()
	{
		//using if-else condition to verify whether logo of agro is displayed or not
		if(HomePage_Elements.logo_of_agro(driver).isDisplayed())
		{
			System.out.println("Agro logo is exist");
		}
		else
		{
			System.out.println("Agro logo is not exist");
		}
	}
	
	/*
	 * This is the method to check whether Hamburger Menu is displayed or not	
	 */
	public void isHamburgerMenuExist()
	{
		//using if-else condition to verify whether Hamburger Menu is displayed or not
		if(HomePage_Elements.hamburgerMenu(driver).isDisplayed())
		{
			System.out.println("Hamburger Menu is exist");
		}
		else
		{
			System.out.println("hamburger Menu is not exist");
		}
	}
	
	/*
	 * This is the method to check whether search icon is displayed or not	
	 */
	public void isSearchIconExist()
	{
		//using if-else condition to verify whether search icon is displayed or not
		if(HomePage_Elements.searchButton(driver).isDisplayed())
		{
			System.out.println("Search Icon is exist");
		}
		else
		{
			System.out.println("Search Icon is not exist");
		}
	}
	
	/*
	 * This is the method to check whether search bar is displayed or not	
	 */
	public void isSearchBarExist()
	{
		//using if-else condition to verify whether search bar is displayed or not
		if(HomePage_Elements.searchBar(driver).isDisplayed())
		{
			System.out.println("Search bar is exist");
		}
		else
		{
			System.out.println("Search bar is not exist");
		}
	}
	
	/*
	 * This is the method to check whether location field is displayed or not	
	 */
	public void isLocationFieldExist()
	{
		//using if-else condition to verify whether location field is displayed or not
		if(HomePage_Elements.getLocationfield(driver).isDisplayed())
		{
			System.out.println("Location field is exist");
		}
		else
		{
			System.out.println("Location field is not exist");
		}
	}
	
	/*
	 * This is the method to check whether message box is displayed or not	
	 */
	public void isMessageFieldExist()
	{
		//using if-else condition to verify whether message box is displayed or not
		if(HomePage_Elements.messageField(driver).isDisplayed())
		{
			System.out.println("Message Field is exist");
		}
		else
		{
			System.out.println("Message Field is not exist");
		}
	}
	
	/*
	 * This is the method to check whether report field is displayed or not	
	 */
	public void isReportsFieldExist()
	{
		//using if-else condition to verify whether report field bar is displayed or not
		if(HomePage_Elements.reportsField(driver).isDisplayed())
		{
			System.out.println("Reports Field is exist");
		}
		else
		{
			System.out.println("Reports Field is not exist");
		}
	}
	
	/*
	 * This is the method to check whether logout button is displayed or not	
	 */
	public void islogoutButtonExist()
	{
		//using if-else condition to verify whether logout button bar is displayed or not
		if(HomePage_Elements.logoutButton(driver).isDisplayed())
		{
			System.out.println("Logout Button is exist");
		}
		else
		{
			System.out.println("Logout Button is not exist");
		}
	}
	
	/*
	 * This is the method to check whether profile picture is displayed or not	
	 */
	public void isprofilePicExist()
	{
		//using if-else condition to verify whether profile picture is displayed or not
		if(HomePage_Elements.profilePic(driver).isDisplayed())
		{
			System.out.println("Profile Picture is exist");
		}
		else
		{
			System.out.println("Profile Picture is not exist");
		}
	}
	
	/*
	 * This is the method to check whether user name is displayed or not	
	 */
	public void isUserNameExist()
	{
		//using if-else condition to verify whether user name is displayed or not
		if(HomePage_Elements.userName(driver).isDisplayed())
		{
			System.out.println("User Name is exist- "+userName(driver).getText());
		}
		else
		{
			System.out.println("User Name is not exist");
		}
	}
	
	/*
	 * This is the method to check whether user designation is displayed or not	
	 */
	public void isUserDesignationExist()
	{
		//using if-else condition to verify whether user designation is displayed or not
		if(HomePage_Elements.userDesignation(driver).isDisplayed())
		{
			System.out.println("User Designation is exist- "+userDesignation(driver).getText());
		}
		else
		{
			System.out.println("User Designation is not exist");
		}
	}
	
	/*
	 * This is the method to check whether share rate is displayed or not	
	 */
	public void isshareRateExist()
	{
		//using if-else condition to verify whether share rate is displayed or not
		if(HomePage_Elements.shareRate(driver).isDisplayed())
		{
			System.out.println("Share Rate is exist");
		}
		else
		{
			System.out.println("Share Rate is not exist");
		}
	}
	
	/*
	 * This is the method to check whether rate text is displayed or not	
	 */
	public void isRateTextExist()
	{
		//using if-else condition to verify whether rate text is displayed or not
		if(HomePage_Elements.rateText(driver).isDisplayed())
		{
			System.out.println("Rate text is exist- "+rateText(driver).getText());
		}
		else
		{
			System.out.println("Rate text is not exist");
		}
	}
	
	/*
	 * This is the method to list the items of side menu	
	 */
	public void menuItemsList()
	{
		HomePage_Elements.menuItems(driver);
	}
		
	/*
	 * This is the method to verify that Income card is exist or not
	 */
	public void isIncomeCardExist()
	{
		//using if-else condition to verify whether income card is displayed or not
		if(HomePage_Elements.incomeCard(driver).isDisplayed())
			System.out.println("Income Card Exist");
		else
			System.out.println("Income Card not Exist");
	}
	
	/*
	 * This is the method to verify that User Registration card is exist or not
	 */
	public void isuserRegistrationCardExist()
	{
		//using if-else condition to verify whether user registration is displayed or not
		if(HomePage_Elements.incomeCard(driver).isDisplayed())
			System.out.println("User Registration Card Exist");
		else
			System.out.println("User Registration Card not Exist");
	}
	
	/*
	 * This is the method to verify Farmer Registration card is exist or not
	 */
	public void isfarmerRegistrationCardExist()
	{
		//using if-else condition to verify whether registration card is displayed or not
		if(HomePage_Elements.incomeCard(driver).isDisplayed())
			System.out.println("Farmer Registration Card Exist");
		else
			System.out.println("Farmer Registration Card not Exist");
	}
	
	/*
	 * This is the method to verify Order Income Card is exist or not
	 */
	public void isorderIncomeCardExist()
	{
		//using if-else condition to verify whether order income card is displayed or not
		if(HomePage_Elements.incomeCard(driver).isDisplayed())
			System.out.println("Order Income Card Exist");
		else
			System.out.println("Order Income Card not Exist");
	}
	
	/*
	 * This is the method to get default value of income from income card
	 */
	public void getDefaultValueOfIncomeCard()
	{	
		System.out.println("Default income is - "+HomePage_Elements.defaultIncome(driver).getText());
	}
	
	/*
	 * This is the method to get default value of user registrations from user registration card	
	 */
	public void getDefaultValueOfUserRegCard()
	{	
		System.out.println("Default user registration is - "+HomePage_Elements.defaultUserRegistration(driver).getText());
	}
	
	/*
	 * This is the method to get default value of farmer registrations from farmer registration card
	 */
	public void getDefaultValueOfFarmerRegCard()
	{	
		System.out.println("Default income is - "+HomePage_Elements.defaultFarmerRegistration(driver).getText());
	}
	
	/*
	 * This is the method to get default value of order income from order income card	
	 */
	public void getDefaultValueOfOrderIncomeCard()
	{	
		System.out.println("Default income is - "+HomePage_Elements.defaultOrderIncome(driver).getText());
	}
	
	/*
	 * This block is an indexed method to get the income for different-2 parameter and verifying 
	 * that value should not be null
	 */
	public void getIncomeByIndex() throws InterruptedException
	{
		HomePage_Elements.dropDownItemsOfCard1(driver);
		verifyIncomeByIndex();
	}
	
	/*
	 * This is the method to verify that All income should not be null
	 */
	public void verifyIncomeByIndex()
	{
		//if-else block is used to verify that all income is not null
		if(HomePage_Elements.defaultIncome(driver).getText()!=null)
			System.out.println("Total Income:- "+defaultIncome(driver).getText());
			else
			System.out.println("nothing to print");
	}
	
	/*
	 * This block is an indexed method to get the user registrations(all,old and new) for different-2 parameter and verifying 
	 * that value should not be null
	 */
	public void getuserByIndex() throws InterruptedException
	{
		HomePage_Elements.dropDownItemsOfCard2(driver);
		verifyuserByIndex();
	}
	
	/*
	 * This is the method to verify that user registrations(all,old and new) should not be null
	 */
	public void verifyuserByIndex()
	{
		//if-else block is used to verify that all user registration is not null
		if(HomePage_Elements.defaultUserRegistration(driver).getText()!=null)
			System.out.println("Total user Registration:- "+defaultUserRegistration(driver).getText());
			else
			System.out.println("nothing to print");
		//if-else block is used to verify that old user registration is not null
		if(HomePage_Elements.defaultOldUserRegistration(driver).getText()!=null)
			System.out.println("Total old user Registration:- "+defaultOldUserRegistration(driver).getText());
		else
			System.out.println("nothing to print");
		//if-else block is used to verify that new user registration is not null
		if(HomePage_Elements.defaultNewUserRegistration(driver).getText()!=null)
			System.out.println("Total new user Registration:- "+defaultNewUserRegistration(driver).getText());
		else
			System.out.println("nothing to print");
	}
	
	/*
	 * This block is an indexed method to get the farmer registrations(all,old and new) for different-2 parameter and verifying 
	 * that value should not be null
	 */
	public void getFarmerByIndex() throws InterruptedException
	{
		HomePage_Elements.dropDownItemsOfCard3(driver);
		verifyFarmerByIndex();
	}
	
	/*
	 * This is the method to verify that farmer registrations(all,old and new) should not be null
	 */
	public void verifyFarmerByIndex()
	{
		//if-else block is used to verify that all farmer registration is not null
		if(HomePage_Elements.defaultFarmerRegistration(driver).getText()!=null)
			System.out.println("Total Farmer Registration:- "+defaultFarmerRegistration(driver).getText());
			else
			System.out.println("nothing to print");
		//if-else block is used to verify that old farmer registration is not null
		if(HomePage_Elements.defaultOldFarmerRegistration(driver).getText()!=null)
			System.out.println("Total old farmer Registration:- "+defaultOldFarmerRegistration(driver).getText());
		else
			System.out.println("nothing to print");
		//if-else block is used to verify that new farmer registration is not null
		if(HomePage_Elements.defaultNewFarmerRegistration(driver).getText()!=null)
			System.out.println("Total new farmer Registration:- "+defaultNewFarmerRegistration(driver).getText());
		else
			System.out.println("nothing to print");
	}
	
	/*
	 * This block is an indexed method to get the order income for different-2 parameter and verifying 
	 * that value should not be null
	 */
	public void getOrderIncomeByIndex() throws InterruptedException
	{
		HomePage_Elements.dropDownItemsOfCard4(driver);
		verifyOrderIncomeByIndex();
	}
	
	/*
	 * This is the method to verify that order income should not be null
	 */
	public void verifyOrderIncomeByIndex()
	{
		//if-else block is used to verify that all order income is not null
		if(HomePage_Elements.defaultOrderIncome(driver).getText()!=null)
			System.out.println("Total order income:- "+defaultOrderIncome(driver).getText());
			else
			System.out.println("nothing to print");
		//if-else block is used to verify that today order income is not null
		if(HomePage_Elements.defaultTodayOrderIncome(driver).getText()!=null)
			System.out.println("Today order income:- "+defaultTodayOrderIncome(driver).getText());
		else
			System.out.println("nothing to print");
		//if-else block is used to verify that last week order income is not null
		if(HomePage_Elements.defaultLastWeekOrderIncome(driver).getText()!=null)
			System.out.println("Last week order income:- "+defaultLastWeekOrderIncome(driver).getText());
		else
			System.out.println("nothing to print");
	}
	/*
	 * This method is to verify that activity card is exist or not
	 * */
	public void isActivityCardExist()
	{
		if(HomePage_Elements.activityCard(driver).isDisplayed())
			System.out.println("Activity Card Exist");
		else
			System.out.println("Activity Card not Exist");
	}
	
	/*
	 * This method is to find the details of yukon gold and verify that clicking on yukon gold 
	 * it is moving to next page or not
	 */	
	public void is_Yukon_Gold_Exist() throws InterruptedException
	{
		HomePage_Elements.yukonGold(driver);
	}
	
	/*
	 * This method is to find the details of quajava Crema and verify that clicking on quajava Crema
	 * it is moving to next page or not
	 */	
	public void is_Quajava_Crema_Exist() throws InterruptedException
	{
		HomePage_Elements.quajavaCrema(driver);;
	}
	
	/*
	 * This method is to find the details of mortgage Lifter and verify that clicking on mortgage Lifter
	 * it is moving to next page or not
	 */	
	public void is_Mortgage_Lifter_Exist() throws InterruptedException
	{
		HomePage_Elements.mortgageLifter(driver);
	}
	
	/*
	 * This method is to find the details of Malus Pumila Apple and verify that clicking on Malus Pumila Apple
	 * it is moving to next page or not
	 */	
	public void is_Malus_Pumila_Apple_Exist() throws InterruptedException
	{
		HomePage_Elements.malusPumilaApple(driver);
	}
	
	/*
	 * This method is to find the details of Blood Orange and verify that clicking on Blood Orange
	 * it is moving to next page or not
	 */	
	public void is_Blood_Orange_Exist() throws InterruptedException
	{
		HomePage_Elements.bloodOrange(driver);
	}
}


	
