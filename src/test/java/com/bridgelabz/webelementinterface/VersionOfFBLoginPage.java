package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VersionOfFBLoginPage {
	@Test
	public static void printVersionOfFBLoginPage() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//String xpathforVersion = "//nobr[contains(text(),'facebook')]";
		String version = driver.findElement(By.xpath("//img[@alt='Facebook']")).getText();
		System.out.println("Version of facebook on login page is : " + version);
		driver.close();
   }
}
