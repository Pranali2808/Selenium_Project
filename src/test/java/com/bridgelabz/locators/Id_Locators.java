package com.bridgelabz.locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Id_Locators {

    @Test
	public void IdLocator() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("8446151018");
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Prashi@123");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Log In")).click();
		
			Thread.sleep(2000);
		    driver.close();

	    }
    @Test
    public static void CreateAccount() throws InterruptedException {
    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.name("firstname")).sendKeys("Prashi");
	        Thread.sleep(2000);

	        driver.findElement(By.name("lastname")).sendKeys("Rane");
	        Thread.sleep(2000);

	        driver.findElement(By.name("reg_email__")).sendKeys("8446151018");
	        Thread.sleep(2000);

	        driver.findElement(By.name("reg_passwd__")).sendKeys("Prashi@123");
	        Thread.sleep(2000);

	        Select selectDay = new Select( driver.findElement(By.name("birthday_day")));
	        selectDay.selectByVisibleText("28");
	        Thread.sleep(2000);

	        Select selectMonth = new Select( driver.findElement(By.name("birthday_month")));
	        selectMonth.selectByVisibleText("Jan");
	        Thread.sleep(2000);

	        Select selectYear = new Select( driver.findElement(By.name("birthday_year")));
	        selectYear.selectByVisibleText("1997");
	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@type='radio' and @value='1']")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.name("websubmit")).click();
	        //Thread.sleep(2000);
	        driver.close();

	    }
}

