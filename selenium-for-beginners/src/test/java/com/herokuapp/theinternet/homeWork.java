package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homeWork {

	@Test(priority=1)
	public void NoSuchElementException() {
		System.out.println("Test 1 = NoSuchElementException");

		// Open page
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
          
		// Instantiate a ChromeDriver class.     
   
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");

		// Click Add button
		driver.findElement(By.id("add_btn")).click();
		// driver.quit();
		sleep(10000);
		// Verify Row 2 input field is displayed
		WebElement row2Input = driver.findElement(By.xpath("//div[@id='row2']/input"));
		Assert.assertTrue(row2Input.isDisplayed(), " row 2 not display");

		// Sleep Thread(3000);

	}
	//@Test

	public void ElementNotInteractableException() {
		System.out.println("Test 2 = ElementNotInteractableException");
	
		

		// Open page
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://practicetestautomation.com/practice-test-exceptions/");

		// Click Add button
				driver.findElement(By.id("add_btn")).click();
		//	Wait for the second row to load
				
				sleep(10000);
			//	Type text into the second input field
				
				WebElement row2Input = driver.findElement(By.xpath("//div[@id='row2']/input"));
				row2Input.sendKeys("burgger");
//	Push Save button using locator By.name("save")
				WebElement saveButton=driver.findElement(By.xpath("//div[@id='row2']/button[@name='Save']"));
				saveButton.click();
//	Verify text saved
				WebElement verifyText=driver.findElement(By.id("confirmation"));
				String actualText=verifyText.getText();
				Assert.assertEquals(actualText,"Row 2 was saved","Actual does't contains excepted text");
	}

	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
