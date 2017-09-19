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
}
	
