package softAssert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirefoxDriver {
  @Test
  public void method() {
	  
	  System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  
	  WebDriver driver= new org.openqa.selenium.firefox.FirefoxDriver();
	  
	  driver.get("https://www.google.co.in");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  driver.manage().window().maximize();
	  
  }
}
