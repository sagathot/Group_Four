package testNG_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Coordinates{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
	}
		 @Test
		 public void performtest() throws InterruptedException {
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.edureka.co/blog/sql-commands");
		 
		 WebElement ele1= driver.findElement(By.xpath(" //strong[contains(text(),'SQL Commands: Data Definition Language Commands (D')]"));
		
		 int x= ele1.getLocation().getX();
		 System.out.println("X cordinate: "+x);
		 
		 int y= ele1.getLocation().getY();
		 System.out.println("Y cordinate: "+y);
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 for(int i=0;i<=10;i++) {
		 js.executeScript("window.scrollBy(1,1000)", "");
		 }
		 Thread.sleep(5000);
		 WebElement create= driver.findElement(By.linkText("CREATE"));
		 create.click();
	}
		 
		 @AfterMethod
			public void closeBrowser() {
			 driver.quit();
		 }
}




