package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		//DDF- Data Driven Framework
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		FileInputStream Myfile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		String userID = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mySheet.getRow(0).getCell(2).getStringCellValue();
		
		driver.findElement(By.id("userid")).sendKeys(userID);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("pin")).sendKeys(pin);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		String actualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expectedText = "DAA677";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Correct user");
			driver.findElement(By.xpath("//span[@class='user-id']")).click();
			driver.findElement(By.xpath("//a[@target='_self']")).click();
		}
		else {
			System.out.println("Incorrect user");
		}
	}

}
