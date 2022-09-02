package com.bridgelabz.webelementcount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CountOfWebElement {

	@Test
	public static void LinkCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();
		System.out.println("Total Number of link count on webpage = " + linkCount);

	}

	@Test
	public static void ImageCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> image = driver.findElements(By.xpath("//img"));
		int imageCount = image.size();
		System.out.println("Total Number of image count on webpage = " + imageCount);

	}

	@Test
	public static void InputTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> inputTag = driver.findElements(By.xpath("//input"));
		int inputTagCount = inputTag.size();
		System.out.println("Total Number of input tag count on webpage = " + inputTagCount);

	}

	@Test
	public static void headTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> headTag = driver.findElements(By.xpath("//head"));
		int headTagCount = headTag.size();
		System.out.println("Total Number of head tag count on webpage = " + headTagCount);

	}

	@Test
	public static void bodyTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> bodyTag = driver.findElements(By.xpath("//body"));
		int bodyTagCount = bodyTag.size();
		System.out.println("Total Number of body tag count on webpage = " + bodyTagCount);

	}

	@Test
	public static void ScriptTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> scriptTag = driver.findElements(By.xpath("//script"));
		int scriptTagCount = scriptTag.size();
		System.out.println("Total Number of script tag count on webpage = " + scriptTagCount);

	}

	@Test
	public static void StyleTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> styleTag = driver.findElements(By.xpath("//style"));
		int styleTagCount = styleTag.size();
		System.out.println("Total Number of style tag count on webpage = " + styleTagCount);

	}

	@Test
	public static void spanTagCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> spanTag = driver.findElements(By.xpath("//span"));
		int spanTagCount = spanTag.size();
		System.out.println("Total Number of span tag count on webpage = " + spanTagCount);

	}

	@Test
	public static void ButtonCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		int buttonCount = button.size();
		System.out.println("Total Number of button count on webpage = " + buttonCount);

	}

	@Test
	public static void TableCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> table = driver.findElements(By.xpath("//table"));
		int TableCount = table.size();
		System.out.println("Total Number of table count on webpage = " + TableCount);

	}

	@Test
	public static void AllElementCount() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));
		int elementsCount = allElements.size();
		System.out.println("Total Number of All Element on webpage = " + elementsCount);
	}
}
