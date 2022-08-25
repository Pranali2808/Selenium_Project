package com.bridgelabz.navigation;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	public static void main(String[] args) throws  InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
	}

}
