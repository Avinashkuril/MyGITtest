package serialNParallelPOMWithDDFTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(className = "user-id") private WebElement user;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validateUser(String usersValid) {
		
		String expectedResult = usersValid;
		String actualResult = user.getText();
		if (expectedResult.equals(actualResult)) {
			System.out.println("The user ID is valid");
			user.click();
			
		}
		else {
			System.out.println("The user ID is invalid");
		}		
	}
	
	public void clickOnLogout() {
		logout.click();
	}

}
