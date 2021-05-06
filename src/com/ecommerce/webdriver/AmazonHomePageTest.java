package com.ecommerce.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomePageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "/home/deepikaeshwaryg/eclipse-workspace/seleniumwebdrivers/driver/chromedriver");

	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com/");
	String pageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	if (driver.getTitle().equals(pageTitle)){
		
		System.out.println("Test case is pass");
		
	}else
	{
		System.out.println("Testcase is failed");
	}
	driver.close();
	}
	
}
