package serialNParallelPOMWithDDFTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement login;
	
  public LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
  }
  
  public void UserID(String uid) {
	  userID.sendKeys(uid);
  }
  
  public void Password(String pw) {
	  password.sendKeys(pw);
  }
  
  public void login() {
	  login.click();
  }
  
  
}
