package com.ecommerce.webdriver;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonHomejunitTest {
	
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.Driver", "/home/deepikaeshwaryg/eclipse-workspace/seleniumwebdrivers/driver/chromedriver");
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	public void test() {
		
		driver.get("https://www.amazon.com/");
		String expectedValue = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualValue = driver.getTitle();
		Assert.assertEquals(expectedValue,actualValue);
		
	}
	@Test
	public void verifySourceURL() {
		String siteURL = "https://www.amazon.com/";
		driver.get(siteURL);
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(siteURL, actualURL);
		
	}
	@Test
	public void verifyMobilePage() {
		String siteURL = "https://www.amazon.in/";
		driver.get(siteURL);
		
		//local mobile link
		WebElement mobilelink = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		
		//click mobile link
		mobilelink.click();
		String expectedValue = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
		String actualValue = driver.getTitle();
		
		Assert.assertEquals(expectedValue, actualValue);
	}
	@Test
	public void verifySearchForIphone() throws InterruptedException {
		String siteURL = "https://www.amazon.in/";
		driver.get(siteURL);
		
		//search box link
		WebElement searchBoxlink = driver.findElement(By.id("twotabsearchtextbox"));
		
		//waits for 2 sec
		Thread.sleep(2000);
		
		//send input to search box
		searchBoxlink.sendKeys("Iphone 11 pro max");
		
		//submit button link
		WebElement submitButton = driver.findElement(By.id("nav-search-submit-button"));
		
		
		//click submit button
		submitButton.click();
		
		//waits for 2 sec
	    Thread.sleep(2000);
		
		String expectedValue = "Amazon.in : Iphone 11 pro max";
		String actualValue = driver.getTitle();
		
		Assert.assertEquals(expectedValue, actualValue);
	}

}
