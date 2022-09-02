package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Facebook_UNandPassword_HeightandWidth {
	@Test
	public static void verifyFBAlignmentUsingCoordinates() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement unTB = driver.findElement(By.id("email"));
		int username_height = unTB.getSize().getHeight();
		int username_width = unTB.getSize().getWidth();
		System.out.println("username_height :" + username_height);
		System.out.println("username_width :" + username_width);

		WebElement pwdTB = driver.findElement(By.name("pass"));
		int password_height = pwdTB.getSize().getHeight();
		int password_width = pwdTB.getSize().getWidth();
		System.out.println("password_height :" + password_height);
		System.out.println("password_width :" + password_width);

		if (username_height == password_height && username_width == password_width) {
			System.out.println("Username and password fields are aligned");
		} else {
			System.out.println("Username and password fields are NOT aligned");
		}
		driver.close();
	}
}
