package testNGWithPropertiesClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage {
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	public Pinpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pi) {
		
		pin.sendKeys(pi);
	}
	
	public void clickOnContinueButton() {
		
		continueButton.click();
	}

}
