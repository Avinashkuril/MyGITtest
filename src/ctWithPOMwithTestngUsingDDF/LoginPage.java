package ctWithPOMwithTestngUsingDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String uid) {
		
		userID.sendKeys(uid);
	}
	
	public void enterPassword(String pw) {
		
		password.sendKeys(pw);
	}
	
	public void clickOnLoginButton() {
		
		loginButton.click();
	}

}
