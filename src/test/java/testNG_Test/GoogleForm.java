package testNG_Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleForm {
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	/*@Test
	public void FillGoogleForm() throws Exception {
		driver.get("https://docs.google.com/forms/d/e/1FAIpQLSe_rvmuziloWAr6RzxDocZJBCwn65XGpHhZgiP0c6aCPbA3Ew/viewform");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destn= new File("C:\\Users\\Lenovo\\eclipse-workspace\\Groupfour_Project\\test.png");
		
		FileHandler.copy(src, destn);
	}*/
	
	@Test
	public void Flipkart() {
		driver.get("https://www.flipkart.com/");
		
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		signup.click();
		
		WebElement email= driver.findElement(By.xpath("//input[@xpath='1']"));
		email.click();
	
		

	}

	public void loginToFlipkart() {
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("testuser@abc.com");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}}
	
