package com.bridgelabz.javaexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class EnterTextinDisabledTextbox {

	@Test
	public static void enterTextinDisabledTextbox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/ranep/Desktop/cqa/index.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		js.executeScript("document.getElementById('t2').value='manager'");
		js.executeScript("document.getElementById('t2').type='button'");
		driver.close();
	}
}
