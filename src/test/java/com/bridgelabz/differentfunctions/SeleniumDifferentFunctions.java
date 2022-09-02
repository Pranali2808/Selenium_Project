package com.bridgelabz.differentfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumDifferentFunctions {

	@Test
	public void usingContainsFunction() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void usingTextFunction() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void usingstartwithFunction() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[starts-with(text(),'Log In')]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
