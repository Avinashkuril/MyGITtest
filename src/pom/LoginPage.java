package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement logInButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserID() {
		userID.sendKeys("DAA677");
	}
	public void sendPassword() {
		password.sendKeys("Velocity@123");
	}
	
	public void loginClick() {
		logInButton.click();
	}

}
