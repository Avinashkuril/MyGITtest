package testng_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className = "user-id") private WebElement userIDcheck;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;

	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public String checkUserID(String ud) {
		
		String actualResult = userIDcheck.getText();
		String expectedResult = ud;
		
		if (expectedResult.equals(actualResult)) {
			
			userIDcheck.click();
		}
		return expectedResult;
	}
	
	public void clickOnLogoutButton() {
		
		logoutButton.click();
	}
}
