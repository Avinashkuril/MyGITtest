package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		LoginPage log= new LoginPage(driver);
		log.sendUserID();
		log.sendPassword();
		log.loginClick();
		Thread.sleep(2000);
		
		PinPage p=new PinPage(driver);
		p.enterPin();
		p.clickOnContinueButton();
		Thread.sleep(2000);
		
		Homepage home=new Homepage(driver);
		home.displayname();
		home.clickOnLogOut();
		Thread.sleep(2000);
		
		driver.close();
	}

}
