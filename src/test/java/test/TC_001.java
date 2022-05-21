package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.massia.org");
		
		Thread.sleep(2000);
		
		driver.navigate().to("http://massiaifc.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		String title1 = driver.getTitle();
		System.out.println(title1);

		
		driver.close();

	}

}
