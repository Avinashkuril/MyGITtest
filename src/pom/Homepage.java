package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement name;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void displayname() {
		String actualuserID = name.getText();
		String expectedUserID = "DAA677";
		
		if(expectedUserID.equals(actualuserID)) {
			System.out.println("This is a valid user");
			name.click();
		}
		else {
			System.out.println("Invalid user");
		}
	}
	
	public void clickOnLogOut() {
		logOutButton.click();
	}
	

}
