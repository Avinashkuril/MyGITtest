package pomWithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExecuteWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions ch= new ChromeOptions();
		ch.addArguments("headless");
		
		WebDriver driver= new ChromeDriver(ch);
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		LogInPage1 log= new LogInPage1(driver);
		log.enterUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		log.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		log.logInButtonClick();
		
		Thread.sleep(1000);
		
		PinPage pi= new PinPage(driver);
		pi.enterPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		pi.clickContinueButton();
		
		Thread.sleep(1000);
		
		Homepage home= new Homepage(driver);
		home.validateUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		home.clickOnLogOutButton();
	}

}
