package com.agro;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


/*********************************************************************************************
 * 
 * this is the class for initializing all the methods to check functionality of web elements
 * This class extends the class LoginElements
 *
 *************************************************************************************************/
public class Login_Page extends LoginElements
{
	WebDriver driver;
	String homepage_url="http://agrofront.sia.co.in/home";

	/*
	 * This is the constructor of this class to initializing WebDriver
	 */
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}

	/*
	 * This is the method to check whether image is displayed or not	
	 */
	public void checkImageIsDisplaying()
	{
		//using if-else condition to verify whether image is displayed or not
		if(LoginElements.loginImage(driver).isDisplayed())
		{
			System.out.println("Image is displaying");
		}
		else
		{
			System.out.println("Image is not displaying");
		}
	}
	
	/*
	 * This is the method to check whether Logo of Agro is displayed or not
	 */
	public void checkAgroLogoIsDisplaying()
	{
		//using if-else condition to verify whether logo of agro is displayed or not
		if(LoginElements.agro_logo(driver).isDisplayed())
		{
			System.out.println("Agro Logo is displaying");
		}
		else
		{
			System.out.println("Agro Logo is not displaying");
		}
		
	}

	/*
	 * this is a method to check whether Text Header(H1) is displayed or not
	 */
	public void verifyTextH1()
	{
	
	String strng1 = LoginElements.header1(driver).getText();
	System.out.println(strng1);
	Assert.assertEquals("Welcome back", strng1);
	
	}
	
	/*
	 * this is a method to check whether Text Header(H2) is displayed or not
	 */
	public void verifyTextH2()
	{
	
	String strng2 = LoginElements.header2(driver).getText();
	System.out.println(strng2);
	Assert.assertEquals("Enter your email address to login to your Agro account", strng2);
	
	}
	
	/*
	 * this is the method to Set user name in textbox
	 */
	public void setUserName(String strUserName)
	{
		LoginElements.username(driver).sendKeys(strUserName);
	}

	/*
	 * This is the method to Set password in password textbox
	 */
	public void setPassword(String strPassword)
	{
		LoginElements.password(driver).sendKeys(strPassword);
	}

	/*
	 * this is the method to Click on login button
	 */
	public void clickLogin()
	{
		LoginElements.loginButton(driver).click();
	}
	
	/*
	 * this is the method for entering username and password and clicking on login button
	 */
	public void loginToAgro(String strUserName,String strPassword) throws InterruptedException
	{
		//Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clickLogin();  
        
    }

	/*
	 * this is the method to get the url of page after successful Login
	 */
	public void geturl()
	{
		//created the object of WebDriverWait class to wait for 10 second after clicking on login button
		WebDriverWait wait = new WebDriverWait(driver, 10);
        assertTrue(wait.until(ExpectedConditions.urlContains(homepage_url)));
        String url = driver.getCurrentUrl(); 
        System.out.println(url);
        
        //if-else condition is used to check agter successful login page is navigate to home page or not
        if (url.equals(homepage_url))
        {
        	System.out.println("Admin Login Successful - Passed");  	
        }
        	
        else 	
        {
        	System.out.println("Admin Login Unsuccessful - Failed");
        	
        }
	}

}
