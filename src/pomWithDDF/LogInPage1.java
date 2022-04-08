package pomWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage1 {

	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginButton;
	
	public LogInPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserID(String uID) {
		userID.sendKeys(uID);
	}
	
	public void enterPassword(String pw) {
		password.sendKeys(pw);
	}
	
	public void logInButtonClick() {
		loginButton.click();
	}
}
