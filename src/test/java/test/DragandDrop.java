package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	    WebElement drg1= driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	    WebElement drp1= driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    
	    WebElement drg2= driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement drp2= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    
	    Actions act =new Actions(driver);
	    act.dragAndDrop(drg1, drp1).build().perform();
	    act.dragAndDrop(drg2, drp2).build().perform();
	    
	    driver.navigate().back();
	    
	    Thread.sleep(2000);
	    driver.close();
	    

	}

}
