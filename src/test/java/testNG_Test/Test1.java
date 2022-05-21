package testNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {
	WebDriver driver;
	//open browser in before method
		@BeforeMethod
	public void BM() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
				
	}
		
		@Test
		public  void performTest() {
			System.out.println("I am being performed");
		}

		@AfterMethod
		public void AM() {
			//Browser closing in After Method
			driver.close();
		}
}
