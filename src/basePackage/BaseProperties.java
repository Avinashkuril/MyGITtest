package basePackage;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility_package.UtilityProperties;

public class BaseProperties {
	
	protected WebDriver driver;
	
	public void browserLaunch() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(UtilityProperties.getDataFromPropertyFile("URL"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
