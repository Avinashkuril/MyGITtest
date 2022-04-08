package softAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTtesting {
		
	
	  @Parameters("browserName")
	  @Test
	  public void CrossBrowser(String browserName) throws InterruptedException {
		  WebDriver driver=null;
		  
		  if(browserName.equals("firefox")) {
			  
			  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			  
			  driver= new FirefoxDriver();
		  }
		  else if (browserName.equals("chrome")) {
			  
			  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			  
			  driver= new ChromeDriver();
			
		}
		  driver.get("https://www.google.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		  driver.manage().window().maximize();
		  Thread.sleep(1000);
		  driver.close();
		  
  }
}
