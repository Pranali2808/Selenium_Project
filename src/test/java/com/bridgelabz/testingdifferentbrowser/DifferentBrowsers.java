package com.bridgelabz.testingdifferentbrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class DifferentBrowsers {
	public static void main(String[] args) {
		System.out.println("Testing Selenium different browsers");
		Options();
	}

	public static void Options() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for testing with geckodriver");
		System.out.println("Enter 2 for testing with chromedriver");
		System.out.println("Enter 3 for testing with IEdriver");
		System.out.println("Enter 4 for exit");
		System.out.println("Enter valid option");
		int input;
		input = scanner.nextInt();
		while (input != 0 && input <= 4)
			switch (input) {
			case 1:
				while (input == 1) {
					try {
						geckodriver();

					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			case 2:
				while (input == 2) {
					try {
						chromedriver();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;
			case 3:
				while (input == 3) {
					try {
						InternetExplorerdriver();
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				break;

			}

	}

	@Test
	public static void geckodriver() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("8446251018");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();

		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public static void chromedriver() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("8446251018");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();

		Thread.sleep(2000);
		driver.close();

	}

	@Test
	public static void InternetExplorerdriver() throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");

		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("8446251018");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();

		Thread.sleep(2000);
		driver.close();

	}

}
