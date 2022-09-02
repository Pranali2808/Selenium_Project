package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UNtextboxisEnabledinFacebook {
	@Test
	public static void verifyUNtextboxisEnabledinFacebook() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.id("email"));
		if (UN.isEnabled()) {
			System.out.println("Username text box is enabled");
		} else {
			System.out.println("Username text box is disabled");
		}
		WebElement PW = driver.findElement(By.name("pass"));
		if (PW.isEnabled()) {
			System.out.println("Password text box is enabled");
		} else {
			System.out.println("Password text box is disabled");
		}
		driver.close();
	}
}
