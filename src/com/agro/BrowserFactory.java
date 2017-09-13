package com.agro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver getBrowser(String BrowserName)
	{
	    if(BrowserName.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver", "/home/mubashir/Downloads/chromedriver");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("headless");
			option.addArguments("window-size=1200x800");
			driver= new ChromeDriver(option);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://agrofront.sia.co.in/");
	    }
	    
	    return driver;
	}
}
