package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown1 {

	public static void main(String[] args) throws Exception {
	
		WebDriverManager.chromedriver().setup();
	//	System.setProperty(null, null)
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V4/");
		WebElement one = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		
		Actions action= new Actions(driver);
		
		Thread.sleep(2000);
		action.moveToElement(one).click().build().perform();
		
		//driver.close(;
		System.out.println(one.getSize());
		
	}
	

}
