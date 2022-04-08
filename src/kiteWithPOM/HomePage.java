package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(className = "user-id") private WebElement UserIDCheck;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String actualUserID() {
		
		String actualUser = UserIDCheck.getText();
		return actualUser;		
	}
	
	public void clickOnLogoutButton() {
		
		UserIDCheck.click();
		logout.click();
	}

}
