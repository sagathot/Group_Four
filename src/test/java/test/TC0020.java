package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC0020 {
	
	public static void dob(WebElement ele, String data) {
		 Select DropDown = new Select(ele);
		 DropDown.selectByVisibleText(data);
	}

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
	
		 WebElement cnr = driver.findElement(By.xpath("//a[contains(@Id,'u_0_2_')]"));
		cnr.click();
			
			Thread.sleep(2000);
			
			WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
			firstname.sendKeys("Sagar");
			WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("Thote");
			WebElement mail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
			mail.sendKeys("thotesagar1@gmail.com");
			
			WebElement re_mail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
			re_mail.sendKeys("thotesagar1@gmail.com");
			
			WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
			pass.sendKeys("Sugar@123");
			
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			day.click();
			
			TC0020.dob(day, "7");
			
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//	month.click();
			TC0020.dob(month, "Nov");
		
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
			
				TC0020.dob(year, "1997");
				
				WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
				//gender.click();
				boolean male = gender.isSelected();
		System.out.println("For Gender"+ male);
				
		if(male==false) {
			gender.click();}
				Thread.sleep(5000);
				driver.close();
	
	}

}
