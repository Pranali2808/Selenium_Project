package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBAlignmentUsingCoordinates {
	@Test
	public static void verifyFBAlignmentUsingCoordinates() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement unTB = driver.findElement(By.id("email"));
		int username_Ycordinate = unTB.getLocation().getY();
		System.out.println("username : " + username_Ycordinate);

		WebElement pwdTB = driver.findElement(By.name("pass"));
		int password_Ycordinate = pwdTB.getLocation().getY();
		System.out.println("password : " + password_Ycordinate);

		if (username_Ycordinate == password_Ycordinate) {
			System.out.println("Both username and password fields are displayed in the same row");
		} else {
			System.out.println("username and password fields are NOT aligned in the same row");
		}
		driver.close();
	}
}
