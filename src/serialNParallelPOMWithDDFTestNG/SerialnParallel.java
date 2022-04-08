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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SerialnParallel {
	
	WebDriver driver=null;
	Sheet mySheet =null;
	
	@Parameters("browserName")
	@BeforeClass
	public void browserLaunch(String browser) {
		
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			driver= new ChromeDriver();
			
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		}
		else if (browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			
			driver= new FirefoxDriver();
			
			driver.get("https://kite.zerodha.com/");
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		LoginPage log= new LoginPage(driver);
		log.UserID(mySheet.getRow(0).getCell(0).getStringCellValue());
		log.Password(mySheet.getRow(0).getCell(1).getStringCellValue());
		log.login();
		Thread.sleep(1000);
		
		PinPage p= new PinPage(driver);
		p.enterPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		p.clickOnContinueButton();
		Thread.sleep(1000);
	
	}
	
  @Test
  public void validateUsersID() throws InterruptedException {
	  
	  Homepage home= new Homepage(driver);
	  home.validateUser(mySheet.getRow(0).getCell(0).getStringCellValue());
	  Thread.sleep(1000);
	  
  }
  
  @AfterMethod
  public void loggingout() throws InterruptedException {
	  
	  Homepage h= new Homepage(driver);
	  h.clickOnLogout();
	  Thread.sleep(1000);
	  }
  
  @AfterClass
  public void closeBrowser() {
	  
	  driver.close();
  }
	  
  
}
