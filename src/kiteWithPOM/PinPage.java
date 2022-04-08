package kiteWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	
	public PinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPin(String pi) {
		
		pin.sendKeys(pi);
	}
	
	public void clickOnContinueButton() throws InterruptedException {
		
		continueButton.click();
		Thread.sleep(1000);
	}

}
