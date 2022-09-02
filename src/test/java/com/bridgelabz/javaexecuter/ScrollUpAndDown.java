package com.bridgelabz.javaexecuter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDown {
	@Test
	public static void scrollUpAndDownPage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, -1000)");
			Thread.sleep(3000);
		}
		driver.close();
	}
	@Test
	public static void scrollUpAndDownFBPage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 400)");
			Thread.sleep(3000);
		}
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, -400)");
			Thread.sleep(3000);
		}
		driver.close();
	}
}
