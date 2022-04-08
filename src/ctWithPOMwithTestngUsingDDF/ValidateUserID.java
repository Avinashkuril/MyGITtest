package ctWithPOMwithTestngUsingDDF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidateUserID {
	
	WebDriver driver;
	Sheet mySheet;
	LoginPage log;
	PinPage p;
	HomePage home;
	
	@Parameters("browserName")
	@BeforeClass
	public void launchingBrowser(String browser) {
		
		if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					"D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			driver= new FirefoxDriver();
		}
		else if (browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					"D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver= new ChromeDriver();
		}
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		Reporter.log("Launch browser", true);
		
	}
	
	@BeforeMethod
	public void logintoKite() throws EncryptedDocumentException, IOException  {
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
	
		log=new LoginPage(driver);
		log.enterUserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		log.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
		log.clickOnLoginButton();
		
		p= new PinPage(driver);
		p.enterPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		p.clickOnContinueButton();	
	}
	
	@Test
  public void validatingUser() {
		
		home= new HomePage(driver);
		home.UserIDCheck(mySheet.getRow(0).getCell(0).getStringCellValue());
  }
	
	@AfterMethod
	public void loggingout() {
		
		home.clickOnLogoutButton();
	}
	
	@AfterClass
	public void closingBrowser() {
		driver.close();
	}
  
}
