package pomWithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement user;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOut;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void validateUserID(String userid) {
		String expectedUserID = userid;
		String actualUserID = user.getText();
		
		if(actualUserID.equals(expectedUserID)) {
			
			System.out.println("The user ID is correct test case passed");
			user.click();
		}
		else {
			System.out.println("The user id is incorrect test case failed");
		}
	}
	
	public void clickOnLogOutButton() {
		logOut.click();
	}
}
