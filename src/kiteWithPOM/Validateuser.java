package kiteWithPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import utility_package.Utility;

public class Validateuser extends BaseClass{
	
	@BeforeClass
	public void launchingBrowser() {
		
		browserLaunch();
	}
	
	@BeforeMethod
	public void loginToKite() throws EncryptedDocumentException, IOException, InterruptedException  {
		
		LoginPage log= new LoginPage(driver);
		log.userid(Utility.excelSheet(0, 0));
		log.enterPassword(Utility.excelSheet(0, 1));
		log.clickOnLoginButton();
		
		PinPage p= new PinPage(driver);
		p.enterPin(Utility.excelSheet(0, 2));
		p.clickOnContinueButton();
	}
	
  @Test
  public void validateUser() throws EncryptedDocumentException, IOException {
	  
	  int TCID = 17;
	  HomePage home= new HomePage(driver);
	  
	  String actualUserIDcheck =home.actualUserID();
	  String expectedUserIDCheck = Utility.excelSheet(0, 0);
	  
	  Assert.assertEquals(actualUserIDcheck, expectedUserIDCheck,"The tc failed");
	  Utility.screenshot(driver, TCID);
	  
  }
  
  @AfterMethod
  public void logout() {
	  
	  HomePage home= new HomePage(driver);
	  home.clickOnLogoutButton();
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
}
