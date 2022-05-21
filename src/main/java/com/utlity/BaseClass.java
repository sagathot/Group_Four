package com.utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
}
	@AfterMethod
	public void closeBrowser() {
	 driver.quit();
 }
}