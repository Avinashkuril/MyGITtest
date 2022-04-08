package testng_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUser {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		LoginPage log= new LoginPage(driver);
		log.enterUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		log.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		log.clickOnLoginButton();
		
		Thread.sleep(2000);
		
		PinPage p= new PinPage(driver);
		p.enterPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		p.clickOnContinueButton();
		Thread.sleep(1000);
		
		HomePage home= new HomePage(driver);
		
		home.checkUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnLogoutButton();
		
		

	}

}
