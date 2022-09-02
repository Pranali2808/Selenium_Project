package com.bridgelabz.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Gmail_contextClickDemo {
	@Test
	public static void gmail_contextClickDemo_archieve() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pranalirane2808");
		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Pranali@123");

		driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		Thread.sleep(10000);

		String xp = "(//b[contains(.,'Following Openings (for Bangalore)')])[2]";

		WebElement mail = driver.findElement(By.xpath(xp));

		System.out.println(mail.getText());

		Actions actions = new Actions(driver);

		actions.contextClick(mail).perform();
		Thread.sleep(6000);

		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
	}
}
