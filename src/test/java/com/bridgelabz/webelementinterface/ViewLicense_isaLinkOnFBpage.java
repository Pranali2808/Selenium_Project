package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ViewLicense_isaLinkOnFBpage {
	@Test
	public static void verifyViewUsername_isaLinkOnFBpage() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String tagName = driver.findElement(By.id("email")).getTagName();
		if (tagName.equals("a")) {
			System.out.println("View username is a link");
		} else {
			System.out.println("View username is NOT a link");
		}
		driver.close();
	}
}
