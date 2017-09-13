package com.agro;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * this is the class for initializing all the methods to check functionality of web elements
 * This class extends the class LoginElements
 */
public class Login_Page extends LoginElements
{
	WebDriver driver;
	
	//This is the constructor of this class to initializing WebDriver
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//This is the method to check whether image is displayed or not
	public void checkImageIsDisplaying()
	{
		if(LoginElements.loginImage(driver).isDisplayed())
		{
			System.out.println("Image is displaying");
		}
		else
		{
			System.out.println("Image is not displaying");
		}
	}
	
	
	//This is the method to check whether Logo of Agro is displayed or not
	public void checkAgroLogoIsDisplaying()
	{
		if(LoginElements.agro_logo(driver).isDisplayed())
		{
			System.out.println("Agro Logo is displaying");
		}
		else
		{
			System.out.println("Agro Logo is not displaying");
		}
		
	}
	
	//this is a method to check whether Text Header(H1) is displayed or not
	public void verifyTextH1()
	{
	
	String strng1 = LoginElements.header1(driver).getText();
	System.out.println(strng1);
	//Assert.assertEquals("Welcome Back", strng1);
	
	}
	
	public void verifyTextH2()
	{
	
	String strng2 = LoginElements.header2(driver).getText();
	System.out.println(strng2);
	//Assert.assertEquals("Enter your email address to login to your Agro account", strng2);
	
	}
	
	
	//this is the method to Set user name in textbox
	public void setUserName(String strUserName)
	{
		LoginElements.username(driver).sendKeys(strUserName);
	}
	
	//This is the method to Set password in password textbox
	public void setPassword(String strPassword)
	{
		LoginElements.password(driver).sendKeys(strPassword);
	}
	
	//this is the method to Click on login button
	public void clickLogin()
	{
		LoginElements.loginButton(driver).click();
	}
	
	public void loginToAgro(String strUserName,String strPassword) throws InterruptedException
	{
		//Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clickLogin();  
        
    }
	
	//this is the method to get the url of page after successful Login
	public void geturl()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
        
        assertTrue(wait.until(ExpectedConditions.urlContains("http://agrofront.sia.co.in/home")));
        String url = driver.getCurrentUrl(); 
        System.out.println(url);
        if (url.equals("http://agrofront.sia.co.in/home"))
        {
        	System.out.println("Admin Login Successful - Passed");  	
        }
        	
        else 	
        {
        	System.out.println("Admin Login Unsuccessful - Failed");
        	
        }
	}

}
