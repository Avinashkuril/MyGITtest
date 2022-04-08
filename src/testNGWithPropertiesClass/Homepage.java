package testNGWithPropertiesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Homepage {
	
	@FindBy(className = "user-id") private WebElement usersIDCheck;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutButton;
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void validateUser(String valid) {
		
		String actualResult =usersIDCheck.getText(); 
		String expectedResult = valid;
		
		if (actualResult.equals(expectedResult)) {
			
			usersIDCheck.click();
			
		}
		else {
			
			Reporter.log("Check userID", true);
		}
	}
	
	public void clickOnLogoutButton() {
		
		logoutButton.click();
	}

}
