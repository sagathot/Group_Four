package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
	
		 WebElement cnr = driver.findElement(By.xpath("//a[contains(@Id,'u_0_2_')]"));
		cnr.click();
			
			Thread.sleep(2000);
			List<WebElement> day = driver.findElements(By.xpath("//select[@id='day']//option"));
		
		
			System.out.println(	day.size());
			for (int i=0; i<= day.size(); i++) {
				String date= day.get(i).getText();
				System.out.println(date);
			}
			
		driver.close();
			
			
	}
	
	

}
