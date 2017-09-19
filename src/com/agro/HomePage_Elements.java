package com.agro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*******************************************************************************************
 * 
 * 
 * 				this is the class for initializing all the Web Elements of Homepage
 * 
 * ****************************************************************************************/

public class HomePage_Elements 
{
	/*
	 * this is the method to finding location PopUp on home-page	
	 */
	public static WebElement location_PopUp(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("button.allow-but"));
		
	}
	
	/*
	 * this is the method to finding top menu bar on home-page	
	 */
	public static WebElement topMenuBar(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("ul.topMenu"));
	}
	
	/*
	 * this is the method to finding logo of agro on home-page	
	 */
	public static WebElement logo_of_agro(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/logo.png']"));
	}
	
	/*
	 * this is the method to finding hamburger menu on home-page	
	 */
	public static WebElement hamburgerMenu(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/menu.png']")); 
	}
	
	/*
	 * this is the method to finding search button on home-page	
	 */
	public static WebElement searchButton(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/search.png']"));
	}
	
	/*
	 * this is the method to finding search bar on home-page	
	 */
	public static WebElement searchBar(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("input[placeholder='Search here']"));
	}
	
	/*
	 * this is the method to finding get location field on home-page	
	 */
	public static WebElement getLocationfield(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("span.locate-font"));
	}

	/*
	 * this is the method to finding message box on home-page	
	 */
	public static WebElement messageField(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/message.png']"));
	}
	
	/*
	 * this is the method to finding report field on home-page	
	 */
	public static WebElement reportsField(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/reports.png']"));
	}
	
	/*
	 * this is the method to finding logout button on home-page	
	 */
	public static WebElement logoutButton(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/icons/logout.png']"));
	}
	
	/*
	 * this is the method to finding profile picture of user on home-page	
	 */
	public static WebElement profilePic(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/images/user.png']"));
	}
	
	/*
	 * this is the method to finding user-name on home-page	
	 */
	public static WebElement userName(WebDriver driver)
	{
		return driver.findElement(By.className("userName"));
	}
	
	/*
	 * this is the method to finding user designation on home-page	
	 */
	public static WebElement userDesignation(WebDriver driver)
	{
		return driver.findElement(By.className("userDesignation"));
	}
	
	/*
	 * this is the method to finding share rate on home-page	
	 */
	public static WebElement shareRate(WebDriver driver)
	{
		return driver.findElement(By.cssSelector("img[src='./assets/images/share.png']"));
	}
	
	/*
	 * this is the method to finding rate text on home-page	
	 */
	public static WebElement rateText(WebDriver driver)
	{
		return driver.findElement(By.className("ratetext"));
	}
	
	/*
	 * this is the method to finding side menu list on home-page and counting number the list items	and listing all the elements
	 */
	public static void menuItems(WebDriver driver)
	{	
		WebElement menuItems = driver.findElement(By.cssSelector("ul.menuItems"));
		List <WebElement> list = menuItems.findElements(By.tagName("li"));
		System.out.println("size of list- "+list.size());
		for(int i = 0; i < list.size(); i++){
		System.out.println("list item:-"+list.get(i).getText());
		}
	}

}

