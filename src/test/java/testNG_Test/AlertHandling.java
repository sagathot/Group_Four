package testNG_Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	WebDriver driver;
@BeforeMethod
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
}
	@Test
	public void handleAlert() throws Exception {
	
	WebElement	custid=driver.findElement(By.xpath("//input[@name='cusid']"));
	custid.click();
	custid.sendKeys("123456");
	
	WebElement	submit=driver.findElement(By.xpath("//input[@name='submit']"));
	submit.click();
	
	Alert alt= driver.switchTo().alert();
	
	String text1=alt.getText();
	System.out.println(text1);
	alt.accept();
	
	Alert alt2= driver.switchTo().alert();
	String text2= alt2.getText();
	System.out.println(text2);
	alt2.accept();
	Thread.sleep(1000);
	
	}

	@AfterMethod
	public void CloseBrowser() {
		driver.quit();
	}
	
}
