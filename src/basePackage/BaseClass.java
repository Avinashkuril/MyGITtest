package basePackage;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected WebDriver driver;
	
	public void browserLaunch() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	
		driver.manage().window().maximize();
	}
	
}
