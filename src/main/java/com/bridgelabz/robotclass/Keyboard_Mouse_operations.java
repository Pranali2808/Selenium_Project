package com.bridgelabz.robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Keyboard_Mouse_operations {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);

		Robot r = new Robot();

		r.mouseMove(300, 500);

		r.keyPress(KeyEvent.VK_ALT);

		r.keyPress(KeyEvent.VK_F);

		r.keyRelease(KeyEvent.VK_F);

		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);

		r.keyPress(KeyEvent.VK_W);

		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);

		driver.quit();
	}

}
