package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataProvider {

	public static void main(String[] agrs) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
			
		
		
		String Path= "C:\\Users\\Lenovo\\eclipse-workspace\\Groupfour_Project\\Test data\\Data.xlsx";
		
		FileInputStream fis= new FileInputStream(Path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	String data1 =	wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data1);
	
	
	String data2 =	wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data2);

	
		System.out.println(data1+" "+ data2);
		
		
		
	}
}
