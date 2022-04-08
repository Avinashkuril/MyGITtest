package serialAndParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial2 {
  @Test
  public void Method2() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.google.com/");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  driver.manage().window().maximize();
	  driver.close();
  }
}
