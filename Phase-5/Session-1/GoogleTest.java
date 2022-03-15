package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {
		
		//set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//for firefox users
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		String expected="Google";
		String actual= driver.getTitle();
		
		if(expected.equals(actual))
			System.out.println("Test Passed..!!");
		else
			System.out.println("Test failed");
		
		driver.close();
	}
}
