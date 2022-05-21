package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_002 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("test") ;
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test@123");
		
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		WebElement loginbutton =  driver.findElement(By.name("login"));
		loginbutton.click();
		
		driver.close();
	}

}
