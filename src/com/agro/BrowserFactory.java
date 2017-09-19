package com.agro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**************************************************************************************************
 * 
 * 			This is a class to initialize the headless chrome browser
 *
 ***************************************************************************************************/
public class BrowserFactory 
{
	static WebDriver driver;
	static String loginpage_url="http://agrofront.sia.co.in/";
	/*
	 * This is a method in which all the steps of initializing chrome browser is written
	 */
	public static WebDriver getBrowser(String BrowserName)
	{
		//if-else condition is used to get the browse name
	    if(BrowserName.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "/home/mubashir/Downloads/chromedriver");
	    	//creating object of ChromeOptions class
			//ChromeOptions option = new ChromeOptions();
			//option.addArguments("headless");
			//option.addArguments("window-size=1200x800");
			//driver= new ChromeDriver(option);
	    	driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(loginpage_url);
	    }
	    
	    return driver;
	}
}
