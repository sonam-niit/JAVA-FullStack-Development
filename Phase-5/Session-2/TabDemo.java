package com.selenium.session2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabDemo {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;

		executor.executeScript("window.open('https://www.google.co.in/','_blank')");
		
		ArrayList<String> list= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(list.get(0));
	}

}
