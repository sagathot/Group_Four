package test;

import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utlity.BaseClass;

@Test
	public class ChildBrowserclose   extends BaseClass{ 
	
	
		public  void method() {
			driver.get("https://massiaifc.com/");
			
			WebElement readmore= driver.findElement(By.xpath("(//span[@class='elementor-button-text'])[1]"));
			readmore.click();
			
			List<WebElement>  noRows= driver.findElements(By.xpath("//tr"));
			int rws=noRows.size();
			System.out.println("Total no of Rows = "+ rws);
			
			List<WebElement>  nocol= driver.findElements(By.xpath("//tr"));
			int col=nocol.size();
			System.out.println("Total no of Rows = "+ rws);
		}}

