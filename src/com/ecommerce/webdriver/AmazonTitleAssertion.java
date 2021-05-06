package com.ecommerce.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import junit.framework.Assert;

public class AmazonTitleAssertion {
	
	@Test
	public void titlePage() {
		//1.set selenium property
		System.setProperty("webdriver.chrome.Driver", "/home/deepikaeshwaryg/eclipse-workspace/seleniumwebdrivers/driver/chromedriver");
		
		//2.Instantiating selenium webdriver
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		String expectedValue = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		String actualValue = driver.getTitle();
		
		Assert.assertEquals(expectedValue,actualValue);
		driver.close();
		
	}

}
