package com.agro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/******************************************************************************************
 * 
 * 
 * 				this is the class for initializing all the Web Elements of Login Page
 * 
 * ***************************************************************************************/


public class LoginElements {
	
	/*
	 * this is the method to finding username field on web-page	
	 */
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(By.id("username"));
	}
	
	/*
	 * this is the method to finding password field on web-page
	 */
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(By.id("password"));
	}
	
	/*
	 * this is the method to finding login button on web-page
	 */
	public static WebElement loginButton(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("button.log-button.allowed-cursor"));
	}
	
	/*
	 * this is the method to finding login image on web-page
	 */
	public static WebElement loginImage(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("div.login-size-img"));
	}

	/*
	 * this is the method to finding agro logo on web-page	
	 */
	public static WebElement agro_logo(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='assets/images/logo.png']"));
	}

	/*
	 * this is the method to finding text header-H1 on web-page
	 */
	public static WebElement header1(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("p.log-head"));
	}

	/*
	 * this is the method to finding text header-H2 on web-page
	 */
	public static WebElement header2(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("p.log-sub-head"));
	}
	
}
