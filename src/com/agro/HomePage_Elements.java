package com.agro;

import java.util.List;
import java.util.Random;

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
	
	/*
	 * this is the method to finding income card on home-page
	 */
	public static WebElement incomeCard(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[1]"));
	}
	
	/*
	 * this is the method to finding user registration card on home-page
	 */
	public static WebElement userRegistrationCard(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]"));
	}
	
	/*
	 * this is the method to finding farmer registration card on home-page
	 */
	public static WebElement farmerRegistrationCard(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]"));
	}
	
	/*
	 * this is the method to finding order income card on home-page
	 */
	public static WebElement orderIncomeCard(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]"));
	}
	
	/*
	 * this is the method to finding default value of income from income card
	 */
	public static WebElement defaultIncome(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='card-font1'])[1]"));
	}
	
	/*
	 * this is the method to finding default value of user registrations from user registration card
	 */
	public static WebElement defaultUserRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='card-font1'])[2]"));
	}
	
	/*
	 * this is the method to finding default value of old user registrations from user registration card
	 */
	public static WebElement defaultOldUserRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[3]/div[1]/p[2]"));
	}
	
	/*
	 * this is the method to finding default value of new user registrations from user registration card
	 */
	public static WebElement defaultNewUserRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[1]/div[3]/div[2]/p[2]"));
	}
	
	/*
	 * this is the method to finding the default value of farmer registrations from farmer registration card
	 */
	public static WebElement defaultFarmerRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='card-font1'])[3]"));
	}
	
	/*
	 * this is the method to finding the default value of old farmer registrations from farmer registration card
	 */
	public static WebElement defaultOldFarmerRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[3]/div[1]/p[2]"));
	}
	
	/*
	 * this is the method to finding the default value of new farmer registrations from farmer registration card
	 */
	public static WebElement defaultNewFarmerRegistration(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[3]/div[2]/p[2]"));
	}
	/*
	 * this is the method to finding default value of order income from order income card	
	 */
	public static WebElement defaultOrderIncome(WebDriver driver)
	{
		return driver.findElement(By.xpath("(//*[@class='card-font1'])[4]"));
	}
	
	/*
	 * this is the method to finding default value of today order income from order income card	
	 */
	public static WebElement defaultTodayOrderIncome(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[3]/div[1]/p[2]"));
	}
	
	/*
	 * this is the method to finding default value of last week order income from order income card	
	 */
	public static WebElement defaultLastWeekOrderIncome(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[1]/div[3]/div[2]/p[2]"));
	}
	
	/*
	 * this is the method to finding drop-down button of first card to select other option
	 */
	public static WebElement dropDownButton1(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@class='ng-tns-c4-1 ui-dropdown-label ui-inputtext ui-corner-all']"));
	}
	
	/*
	 * This is a method to select random option from the given Income card list
	 * */
	public static void dropDownItemsOfCard1(WebDriver driver) throws InterruptedException
	{
		dropDownButton1(driver).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * this is the method to finding drop-down button of second card to select other option
	 */
	public static WebElement dropDownButton2(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[2]/p-dropdown/div/label"));
	}
	
	/*
	 * This is a method to select random option from the given user registration card list
	 * */
	public static void dropDownItemsOfCard2(WebDriver driver) throws InterruptedException
	{
		dropDownButton2(driver).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * this is the method to finding drop-down button of third card to select other option
	 */
	public static WebElement dropDownButton3(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[2]/p-dropdown/div/div[3]"));
	}
	
	/*
	 * This is a method to select random option from the given farmer registration card list
	 * */
	public static void dropDownItemsOfCard3(WebDriver driver) throws InterruptedException
	{
		dropDownButton3(driver).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * this is the method to finding drop-down button of fourth card to select other option
	 */
	public static WebElement dropDownButton4(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[2]/p-dropdown/div/div[3]"));
	}
	
	/*
	 * This is a method to select random option from the given Order Income card list
	 * */
	public static void dropDownItemsOfCard4(WebDriver driver) throws InterruptedException
	{
		dropDownButton4(driver).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * this is a method to generate random number
	 * */
	public static int randomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(3) + 3;	
	}

}

