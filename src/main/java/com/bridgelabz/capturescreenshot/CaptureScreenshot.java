package com.bridgelabz.capturescreenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CaptureScreenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		Date d = new Date();

		String date1 = d.toString();
		System.out.println(date1);

		String date2 = date1.replaceAll(":", "_");
		System.out.println(date2);

		driver.get("https://www.facebook.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);

		File destFile = new File(".\\screenshot\\" + date2 + "__actiTIMELoginPage.png");

		FileUtils.copyFile(srcFile, destFile);

		driver.close();
	}
}
