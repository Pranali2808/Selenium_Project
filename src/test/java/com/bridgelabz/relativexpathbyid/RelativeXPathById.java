package com.bridgelabz.relativexpathbyid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RelativeXPathById {
	@Test
	public void LogIn() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='u_0_9_Y4']")).click();

		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public static void CreateAccount() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create New")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='u_1k_b_NH']")).sendKeys("Prashi");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='u_1k_d_F9']")).sendKeys("Rane");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='u_1k_g_16']")).sendKeys("8446151018");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Prashi@123");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("28");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1998");
		Thread.sleep(2000);

		driver.findElements(By.xpath("//select[@id='year']")).get(0).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='u_1k_s_BK']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}
