package testngWithPOMclassUsingBasenUtility;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basePackage.BaseClassWithTestng;
import utility_package.UtilityClassWithTestng;

 @Parameters("browserName")
public class ValidateUser extends BaseClassWithTestng {
	
	LoginPage log;
	PinPage p;
	HomePage home;
	
	@BeforeClass
	public void launchBrowser(String browser) {
		
		if (browser.equals("chrome")) {
			chromeLaunch();
			
		}
		else if (browser.equals("firefox")) {
			firefoxLaunch();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
	}
	
	@BeforeMethod
	public void loginKite() throws EncryptedDocumentException, IOException, InterruptedException {
		
		log= new LoginPage(driver);
		log.enterUserID(UtilityClassWithTestng.readFromExcelSheet(0, 0));
		log.enterPassword(UtilityClassWithTestng.readFromExcelSheet(0, 1));
		log.clickOnLoginButton();
		Thread.sleep(1000);
		
		p= new PinPage(driver);
		p.enterPin(UtilityClassWithTestng.readFromExcelSheet(0, 2));
		p.clickOnContinueButton();
		Thread.sleep(1000);
		
	}
	
  @Test
  public void validatingUser() throws EncryptedDocumentException, IOException {
	  
	  home= new HomePage(driver);
	  home.userCheck(UtilityClassWithTestng.readFromExcelSheet(0, 0));
  }
  
  @AfterMethod
  public void loggingout() {
	  
	  home= new HomePage(driver);
	  home.clickOnLogoutButton();
  }
  
  @AfterClass
  public void closingBrowser() {
	  driver.close();
  }
}
