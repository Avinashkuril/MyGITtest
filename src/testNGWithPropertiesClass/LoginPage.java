package testNGWithPropertiesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.UtilityProperties;

public class LoginPage {
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void UsersID(String uid) {
		
		userID.sendKeys(uid);
	}
	
	public void passWord(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
	}

}
