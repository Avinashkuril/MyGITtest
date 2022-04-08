package testngWithPOMclassUsingBasenUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(className = "user-id") private WebElement checkUserID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	public HomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void userCheck(String ud) {
		
		String expectedResult = ud;
		String actualResult = checkUserID.getText();
		
		if (actualResult.equals(expectedResult)) {
			
			checkUserID.click();
		}
	}
	
	public void clickOnLogoutButton() {
		logoutButton.click();
	}
}
