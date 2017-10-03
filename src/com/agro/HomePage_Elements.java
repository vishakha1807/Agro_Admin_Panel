package com.agro;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

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
		return driver.findElement(By.cssSelector("img[src='http://agro.sia.co.in/common.png']"));
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
	 * This is a method to select random option from the given Income card list
	 * */
	public static void dropDownItemsOfCard1(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='ng-tns-c4-1 ui-dropdown-label ui-inputtext ui-corner-all']")).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[1]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * This is a method to select random option from the given user registration card list
	 * */
	public static void dropDownItemsOfCard2(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[2]/p-dropdown/div/label")).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[2]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}

	/*
	 * This is a method to select random option from the given farmer registration card list
	 * */
	public static void dropDownItemsOfCard3(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[2]/p-dropdown/div/div[3]")).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[3]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * This is a method to select random option from the given Order Income card list
	 * */
	public static void dropDownItemsOfCard4(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[2]/p-dropdown/div/div[3]")).click();
		WebElement parentElement = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[2]/div[4]/div/div[2]/p-dropdown/div/div[4]/div/ul"));
		List <WebElement> list = parentElement.findElements(By.tagName("li"));
		list.get(randomNumber()).click();
		Thread.sleep(2000);
	}
	
	/*
	 * This method is to finding activity card on dash-board 
	 */
	public static WebElement activityCard(WebDriver driver)
	{
		return driver.findElement(By.className("activity-card"));
	}
	
	/*
	 * This method is to find the details of yukon gold and verify that clicking on yukon gold 
	 * it is moving to next page or not
	 */	
	public static void yukonGold(WebDriver driver) throws InterruptedException
	{
		WebElement parentElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[3]/div[2]/div/div[2]"));
		//it is for finding the image of yukon gold
		WebElement image=parentElement.findElement(By.xpath(".//div[1]"));
		//it is for verifying that image is displaying or not
		image.isDisplayed();
		//it is for finding the product name of yukon gold
		WebElement product_name=parentElement.findElement(By.xpath(".//div[2]"));
		//it is for verifying that image is displaying or not
		product_name.isDisplayed();
		Assert.assertEquals(product_name.getText(), product_name.getText());
		//it is for finding the category of yukon gold
		WebElement category=parentElement.findElement(By.xpath(".//div[3]"));
		//it is for verifying that category of yukon gold is displaying or not
		category.isDisplayed();
		Assert.assertEquals(category.getText(),category.getText());
		//it is for finding the farmer name of yukon gold
		WebElement farmer_name=parentElement.findElement(By.xpath(".//div[4]"));
		//it is for verifying the farmer name of yukon gold is displaying or not
		farmer_name.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		//it is for finding the posting date of yukon gold
		WebElement posting_date=parentElement.findElement(By.xpath(".//div[5]"));
		//it is for verifying that posting date of yukon gold is displaying or not
		posting_date.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		//click on image of yukon gold to check whether it is moving to detailed page of yukon gold or not
		image.click();
		Assert.assertEquals("Yukon Gold", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-view-product/div[2]/div/div[2]/div[1]/div[1]/p")).getText());		
		//clicking on dashboard option
		driver.findElement(By.xpath("//*[@id=\"style2\"]/div[6]/ul/li[1]")).click();
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll up the webpage
	  	jse.executeScript("window.scrollBy(0,-1000)", "");
	  	Thread.sleep(2000);
	  	//clicking on allow location button
		driver.findElement(By.className("allow-but")).click();
		Thread.sleep(2000);
		// calling executeScript() method to scroll down the webpage
	  	jse.executeScript("window.scrollBy(0,1000)", "");
	}
	
	/*
	 * This method is to find the details of quajava Crema and verify that clicking on quajava Crema
	 * it is moving to next page or not
	 */	
	public static void quajavaCrema(WebDriver driver) throws InterruptedException
	{
		WebElement parentElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[3]/div[2]/div/div[3]"));
		WebElement image=parentElement.findElement(By.xpath(".//div[1]"));
		image.isDisplayed();
		WebElement product_name=parentElement.findElement(By.xpath(".//div[2]"));
		product_name.isDisplayed();
		Assert.assertEquals(product_name.getText(), product_name.getText());
		WebElement category=parentElement.findElement(By.xpath(".//div[3]"));
		category.isDisplayed();
		Assert.assertEquals(category.getText(),category.getText());
		WebElement farmer_name=parentElement.findElement(By.xpath(".//div[4]"));
		farmer_name.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		WebElement posting_date=parentElement.findElement(By.xpath(".//div[5]"));
		posting_date.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		image.click();
		Assert.assertEquals("quajava crema", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-view-product/div[2]/div/div[2]/div[1]/div[1]/p")).getText());		
		driver.findElement(By.xpath("//*[@id=\"style2\"]/div[6]/ul/li[1]")).click();
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll up the webpage
	  	jse.executeScript("window.scrollBy(0,-1000)", "");
	  	Thread.sleep(2000);
		driver.findElement(By.className("allow-but")).click();
		Thread.sleep(2000);
		// calling executeScript() method to scroll down the webpage
	  	jse.executeScript("window.scrollBy(0,2000)", "");
	}
	
	/*
	 * This method is to find the details of mortgage Lifter and verify that clicking on mortgage Lifter
	 * it is moving to next page or not
	 */	
	public static void mortgageLifter(WebDriver driver) throws InterruptedException
	{
		WebElement parentElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[3]/div[2]/div/div[4]"));
		WebElement image=parentElement.findElement(By.xpath(".//div[1]"));
		image.isDisplayed();
		WebElement product_name=parentElement.findElement(By.xpath(".//div[2]"));
		product_name.isDisplayed();
		Assert.assertEquals(product_name.getText(), product_name.getText());
		WebElement category=parentElement.findElement(By.xpath(".//div[3]"));
		category.isDisplayed();
		Assert.assertEquals(category.getText(),category.getText());
		WebElement farmer_name=parentElement.findElement(By.xpath(".//div[4]"));
		farmer_name.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		WebElement posting_date=parentElement.findElement(By.xpath(".//div[5]"));
		posting_date.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		image.click();
		Assert.assertEquals("Mortgage Lifter", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-view-product/div[2]/div/div[2]/div[1]/div[1]/p")).getText());		
		driver.findElement(By.xpath("//*[@id=\"style2\"]/div[6]/ul/li[1]")).click();
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll up the webpage
	  	jse.executeScript("window.scrollBy(0,-1000)", "");
	  	Thread.sleep(2000);
		driver.findElement(By.className("allow-but")).click();
		Thread.sleep(2000);
		// calling executeScript() method to scroll down the webpage
	  	jse.executeScript("window.scrollBy(0,2000)", "");
	}
	
	/*
	 * This method is to find the details of Malus Pumila Apple and verify that clicking on Malus Pumila Apple
	 * it is moving to next page or not
	 */	
	public static void malusPumilaApple(WebDriver driver) throws InterruptedException
	{
		WebElement parentElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[3]/div[2]/div/div[5]"));
		WebElement image=parentElement.findElement(By.xpath(".//div[1]"));
		image.isDisplayed();
		WebElement product_name=parentElement.findElement(By.xpath(".//div[2]"));
		product_name.isDisplayed();
		Assert.assertEquals(product_name.getText(), product_name.getText());
		WebElement category=parentElement.findElement(By.xpath(".//div[3]"));
		category.isDisplayed();
		Assert.assertEquals(category.getText(),category.getText());
		WebElement farmer_name=parentElement.findElement(By.xpath(".//div[4]"));
		farmer_name.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		WebElement posting_date=parentElement.findElement(By.xpath(".//div[5]"));
		posting_date.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		image.click();
		Assert.assertEquals("Malus pumila Apple", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-view-product/div[2]/div/div[2]/div[1]/div[1]/p")).getText());		
		driver.findElement(By.xpath("//*[@id=\"style2\"]/div[6]/ul/li[1]")).click();
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll up the webpage
	  	jse.executeScript("window.scrollBy(0,-1000)", "");
	  	Thread.sleep(2000);
		driver.findElement(By.className("allow-but")).click();
		Thread.sleep(2000);
		// calling executeScript() method to scroll down the webpage
	  	jse.executeScript("window.scrollBy(0,2000)", "");
	}
	
	/*
	 * This method is to find the details of Blood Orange and verify that clicking on Blood Orange
	 * it is moving to next page or not
	 */	
	public static void bloodOrange(WebDriver driver) throws InterruptedException
	{
		WebElement parentElement=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-dashboard/div[1]/div[3]/div[3]/div[2]/div/div[6]"));
		WebElement image=parentElement.findElement(By.xpath(".//div[1]"));
		image.isDisplayed();
		WebElement product_name=parentElement.findElement(By.xpath(".//div[2]"));
		product_name.isDisplayed();
		Assert.assertEquals(product_name.getText(), product_name.getText());
		WebElement category=parentElement.findElement(By.xpath(".//div[3]"));
		category.isDisplayed();
		Assert.assertEquals(category.getText(),category.getText());
		WebElement farmer_name=parentElement.findElement(By.xpath(".//div[4]"));
		farmer_name.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		WebElement posting_date=parentElement.findElement(By.xpath(".//div[5]"));
		posting_date.isDisplayed();
		Assert.assertEquals(farmer_name.getText(),farmer_name.getText());
		image.click();
		Assert.assertEquals("Blood Orange", driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/app-view-product/div[2]/div/div[2]/div[1]/div[1]/p")).getText());		
		driver.findElement(By.xpath("//*[@id=\"style2\"]/div[6]/ul/li[1]")).click();
		// Creating the object of java Script executor
	  	JavascriptExecutor jse = (JavascriptExecutor)driver;
		// calling executeScript() method to scroll up the webpage
	  	jse.executeScript("window.scrollBy(0,-1000)", "");
	  	Thread.sleep(2000);
		driver.findElement(By.className("allow-but")).click();
		Thread.sleep(2000);
		// calling executeScript() method to scroll down the webpage
	  	jse.executeScript("window.scrollBy(0,2000)", "");
	}
	
	/*
	 * this is a method to generate random number
	 * */
	public static int randomNumber()
	{
		Random rand = new Random();
		return rand.nextInt(3);	
	}

}

