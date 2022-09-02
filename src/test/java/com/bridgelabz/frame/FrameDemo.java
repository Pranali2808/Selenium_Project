package com.bridgelabz.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FrameDemo {
	@Test
	public static void frameDemo() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ranep/Desktop/cqa/page2.html");

		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("a");
		Thread.sleep(2000);

		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("b");
		Thread.sleep(2000);

		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");
		Thread.sleep(2000);

		WebElement f = driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t1")).sendKeys("d");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		Thread.sleep(2000);
		driver.close();
	}
}
