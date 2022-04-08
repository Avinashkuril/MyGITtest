package kiteWithPOM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseClass;
import bsh.util.Util;
import utility_package.Utility;

public class TestForInvalidUsernameMsg extends BaseClass{
	
	@BeforeClass
	public void launchingBrowser() {
		browserLaunch();
	}
	
	@BeforeMethod
	public void loggingIntoKite() throws EncryptedDocumentException, IOException {
		
		LoginPage log= new LoginPage(driver);
		log.enterPassword(Utility.excelSheet(0, 1));
		log.clickOnLoginButton();
				
	}
		
	
  @Test
  public void errorMsgShow() throws EncryptedDocumentException, IOException {
	  
	  int TCID = 10;
	  
	  LoginPage log= new LoginPage(driver);
	  
	  String expectedMsg = Utility.excelSheet(0, 4);
	  String actualMsg = log.errorUserIDmsg();
	  
	  Assert.assertEquals(actualMsg, expectedMsg,"tc failed");
	  Utility.screenshot(driver, TCID);;
  }
  
  @AfterMethod
  public void closeBrowser() {
	  driver.close();
  }
}
