package testNG_Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utlity.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iframeHandling extends BaseClass{

	@Test
	public void handleiFrame() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		WebElement iframe= driver.findElement(By.xpath("//iframe[contains(text(),'<br />')]"));
		driver.switchTo().frame(iframe);
		String handle=driver.getWindowHandle();
		System.out.println(handle);
		System.out.println("==========");
		Set<String> handles=driver.getWindowHandles();
		int count = handles.size();
		System.out.println("no of windows "+ count);

		System.out.println(handles);
	WebElement all= driver.findElement(By.xpath("//span[@id='current_filter']"));
	all.click();
		Thread.sleep(2000);
		
		
	
	}
}