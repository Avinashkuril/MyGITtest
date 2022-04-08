package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassWithTestng {
	
	protected static WebDriver driver;
	
	public void chromeLaunch() {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
	}
	
	public void firefoxLaunch() {
		
		System.setProperty("webdriver.gecko.driver", 
				"D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		
	}
	
}
