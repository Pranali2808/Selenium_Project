package com.bridgelabz.webelementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UsernameAndPswdAllignment {

	@Test
	public static void verifyUsernameAndPswdAllignment() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement unTB = driver.findElement(By.id("email"));
		int un_x = unTB.getLocation().getX();
		int un_width = unTB.getSize().getWidth();
		int un_height = unTB.getSize().getHeight();
		System.out.println(" username: " + un_x);
		System.out.println(" username widhth: " + un_width);
		System.out.println(" username height: " + un_height);
		WebElement pwTB = driver.findElement(By.name("pass"));
		int pw_x = pwTB.getLocation().getX();
		int pw_width = pwTB.getSize().getWidth();
		int pw_height = pwTB.getSize().getHeight();
		System.out.println(" password: " + pw_x);
		System.out.println(" password widhth: " + pw_width);
		System.out.println(" password height: " + pw_height);
		if (un_x == pw_x && un_width == pw_width && un_height == pw_height) {
			System.out.println("Username and password text box are aligned");
		} else {
			System.out.println("Username and password text box are NOT aligned");
		}
		driver.close();
	}
}
