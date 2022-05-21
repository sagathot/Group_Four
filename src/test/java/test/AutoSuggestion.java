package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		WebElement searchbar= driver.findElement(By.xpath("//input[@name='q']"));
		searchbar.sendKeys("Maven");
		
		Thread.sleep(1000);
		
		List <WebElement> searchresults= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	
		System.out.println(searchresults.size());
		System.out.println(searchresults.get(3).getText());

		for (int i=0;i<searchresults.size();i++) {
			
			System.out.println(searchresults.get(i).getText());
		}
		
		
		driver.close();
	}

}
