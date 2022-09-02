package com.bridgelabz.downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DownloadSelenium {

	@Test
	public static void SeleniumFileDwnld() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='4.4.0']")).click();
	}
}
