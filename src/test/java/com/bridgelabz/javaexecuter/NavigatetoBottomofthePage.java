package com.bridgelabz.javaexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NavigatetoBottomofthePage {
	@Test
	public static void navigatetoBottomofthePage() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\\\Selenium\\\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/download/");
		WebElement element = driver.findElement(By.xpath("//a[@href='/about/']"));
		System.out.println("Element is found");
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		System.out.println("X coordinate is :"+x + " and Y coordinate is :"+ y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		element.click();
		driver.close();
	}
}
