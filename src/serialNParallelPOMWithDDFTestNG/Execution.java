package serialNParallelPOMWithDDFTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Execution {
	
	WebDriver driver=null;
	Sheet MySheet=null;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		Reporter.log("Opening Browser", true);
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		Reporter.log("Broswer successfully opened", true);
	
		FileInputStream MyFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		MySheet=WorkbookFactory.create(MyFile).getSheet("Sheet2");
		
	}
	
	@BeforeMethod
	public void loginZerodha() throws InterruptedException{
		
		Reporter.log("Entering login details", true);
		
		LoginPage log= new LoginPage(driver);
		log.UserID(MySheet.getRow(0).getCell(0).getStringCellValue());
		log.Password(MySheet.getRow(0).getCell(1).getStringCellValue());
		log.login();
		Thread.sleep(1000);
		
		Reporter.log("Entering pin details", true);
		
		PinPage p= new PinPage(driver);
		p.enterPin(MySheet.getRow(0).getCell(2).getStringCellValue());
		p.clickOnContinueButton();
	
	}
	
  @Test
  public void ValidateUserID() throws InterruptedException {
	
	  Reporter.log("Validating user", true);
	  
	  Homepage home= new Homepage(driver);
		home.validateUser(MySheet.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(1000);
		
		Reporter.log("User validated successfully", true);
  }
  
  @AfterMethod
  public void logout() throws InterruptedException {
	  
	  Reporter.log("logging out", true);
	  
	  Homepage h= new Homepage(driver);
	  h.clickOnLogout();
	  Thread.sleep(1000);
  }
  
  @AfterClass
  public void closeBrowser() {
	  
	  Reporter.log("Closing browser", true);
	  
	  driver.close();
  }
}
