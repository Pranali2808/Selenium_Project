package com.bridgelabz.seleniumautomationtesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver {
	public static void main(String[] args) throws InterruptedException {
		 
		
		 System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		 
		
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://www.google.com");
		 
		
		  String title = driver.getTitle();
		 System.out.println("the title of the page is :"+ title);
		 
		 
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println("the URL of the page is :"+ currentUrl);
		 
		 
		 String pageSource = driver.getPageSource();
		 System.out.println("the source code of the page is :"+ pageSource);
		 
		 
		 Thread.sleep(2000);
		 
		 driver.close();
		 }
    }


