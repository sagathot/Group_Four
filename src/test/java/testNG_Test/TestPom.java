package testNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LoginPom;

public class TestPom {

	@Test
	public void verifyTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	LoginPom login=	PageFactory.initElements(driver, LoginPom.class);
	System.out.println(driver.getTitle());
	login.getTxt_Emailid().sendKeys("thotesaga1@gmail.com");
	login.getTxt_Pass().sendKeys("Sugar@123");
	login.getClick_login().click();
	
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
	driver.quit();
	}
	
}
