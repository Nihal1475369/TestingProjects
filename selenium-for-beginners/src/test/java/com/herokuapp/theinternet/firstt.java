package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class firstt {
	@Test
	// import org.openqa.selenium.By;
	// import org.openqa.selenium.chrome.ChromeDriver;

	// public class FirstProject {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/login");
//		enter user name 
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		Thread.sleep(3000);
//		enter password
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		// WebElement password = driver.findElement(By.id("password"));
		// password.sendKeys("SuperSecretPassword!");
		Thread.sleep(3000);
//		click login button
		WebElement login = driver.findElement(By.xpath("//button[@class='radius']"));
		login.click();
		// maximize browser window
		// driver.manage().window().maximize();
		String expectedUrl = "https://the-internet.herokuapp.com/secure";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not the same as expected");
//	logout button is visible 
		WebElement loginOut = driver.findElement(By.xpath("//a[@class='button secondary radius']"));
		loginOut.click();
//	succesful login msg
		// close browser
		driver.quit();
		// driver.quit();
		// driver.get("https://www.amazon.com/");
		// driver.findElement(By.id("gh-ac")).sendKeys("phone");
		// driver.findElement(By.id("gh-btn")).click();
		// System.setProperty("webdriver.chrome.driver","C:\\Selenium-java")
	}

}
