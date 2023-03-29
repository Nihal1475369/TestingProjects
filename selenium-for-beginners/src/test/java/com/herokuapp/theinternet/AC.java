package com.herokuapp.theinternet;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AC {
	public static void main(String[] args)throws Exception{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.get("https://www.amazone.com/");
	}

}
