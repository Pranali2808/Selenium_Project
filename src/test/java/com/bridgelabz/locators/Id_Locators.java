package com.bridgelabz.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Id_Locators {

    @Test
<<<<<<< HEAD
	public static void IdLocator() throws InterruptedException {
=======
	public void IdLocator() throws InterruptedException 
	{
>>>>>>> 3d1b5d48d091db1afc09ff5aec8983ee58026339

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
        public static void CreateAccount() throws InterruptedException 
	{
           System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

	   WebDriver driver = new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	
	        driver.manage().window().maximize();
	        driver.findElement(By.linkText("Create New Account")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.name("firstname")).sendKeys("Prashi");
	        Thread.sleep(2000);

	        driver.findElement(By.name("lastname")).sendKeys("Rane");
	        Thread.sleep(2000);

	        driver.findElement(By.name("reg_email__")).sendKeys("8446251018");
	        Thread.sleep(2000);

	        driver.findElement(By.name("reg_passwd__")).sendKeys("Prashi@123");
	        Thread.sleep(2000);

	        driver.findElement(By.name("birthday_day")).sendKeys("28");
	        Thread.sleep(2000);

	        driver.findElement(By.name("birthday_month")).sendKeys("Jan");
	        Thread.sleep(2000);

	        driver.findElement(By.name("birthday_year")).sendKeys("1997");
	        Thread.sleep(2000);

	        driver.findElements(By.name("sex")).get(0).click();
	        Thread.sleep(2000);

	        driver.findElement(By.name("websubmit")).click();
	        Thread.sleep(2000);
	        driver.close();

       }
}

