package testNGWithPropertiesClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseProperties;
import utility_package.UtilityProperties;

public class ValidateUser extends BaseProperties{
  
	int TCID=10;
	@BeforeClass
	public void launchingBrowser() throws IOException {
		
		browserLaunch();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@BeforeMethod
	public void loginKite() throws EncryptedDocumentException, IOException, InterruptedException {
		
		LoginPage log= new LoginPage(driver);
		log.UsersID(UtilityProperties.getDataFromPropertyFile("UID"));
		log.passWord(UtilityProperties.getDataFromPropertyFile("PW"));
		log.clickOnLoginButton();
		
		Thread.sleep(1000);
		
		Pinpage p= new Pinpage(driver);
		p.enterPin(UtilityProperties.getDataFromPropertyFile("PIN"));
		p.clickOnContinueButton();
				
	}
	
	@Test
  public void validateUserID() throws EncryptedDocumentException, IOException {
		
		
		
		Homepage home= new Homepage(driver);
		Assert.fail();
		home.validateUser(UtilityProperties.getDataFromPropertyFile("UID"));
		UtilityProperties.screenshot(driver, TCID);
		
		
  }
	
	@AfterMethod
	public void loggingout(ITestResult result) throws IOException {
		
		if (result.getStatus()==result.FAILURE) {
			
			UtilityProperties.screenshot(driver, TCID);
		}
		else {
			Reporter.log("TC is passed", true);
		}
		
		Homepage home= new Homepage(driver);
		home.clickOnLogoutButton();
	}
	
	@AfterClass
	public void closingBrowser() {
		driver.close();
	}
}
