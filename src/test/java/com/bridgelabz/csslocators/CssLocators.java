package com.bridgelabz.csslocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CssLocators {
	@Test
	public void LogIn() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("8446151018");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#loginbutton")).click();
		
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

		        driver.findElement(By.cssSelector("#u_3_b_wT")).sendKeys("Prashi");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#u_3_d_80")).sendKeys("Rane");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#u_3_g_k1")).sendKeys("8446151018");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#password_step_input")).sendKeys("Prashi@123");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#day")).sendKeys("28");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#month")).sendKeys("Jan");
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#year")).sendKeys("1997");
		        Thread.sleep(2000);

		        driver.findElements(By.cssSelector("#u_3_4_hT")).get(0).click();
		        Thread.sleep(2000);

		        driver.findElement(By.cssSelector("#u_3_s_xN")).click();
		        Thread.sleep(2000);
		        driver.close();

		    }
	}



