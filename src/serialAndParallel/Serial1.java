package serialAndParallel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Serial1 {
  @Test
  public void Method1() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://ww2.gogoanime2.org/watch/kimetsu-no-yaiba-dub/24");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  driver.manage().window().maximize();
	  driver.close();
  }
}
