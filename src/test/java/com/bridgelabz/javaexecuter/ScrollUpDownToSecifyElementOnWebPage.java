package com.bridgelabz.javaexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ScrollUpDownToSecifyElementOnWebPage {
	@Test
	public static void scrollUpAndDownToSecifyElementOnFBPage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//a[@title='Facebook Lite for Android.']"));
		System.out.println("Facebook Lite webelement found");
		driver.close();
	}

	@Test
	public static void scrollUpAndDownToSecifyElementOnWebPage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 1; i < 10; i++) {
			js.executeScript("window.scrollBy(0, 1000)");
			Thread.sleep(3000);
		}
		driver.findElement(By.xpath("//img[@alt='Applitools']"));
		System.out.println("Applitool webelement found");
		driver.close();
	}

	@Test
	public static void scrollUpAndDownToSecifyElementByCoordinates() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumhq.org/download");
		WebElement element = driver.findElement(By.xpath("//img[@alt='Perfecto']"));
		System.out.println("webelement found");
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ")");
		driver.close();
	}
}
