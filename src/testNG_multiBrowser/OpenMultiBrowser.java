package testNG_multiBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenMultiBrowser {
  @Test
  public void Method1() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver= new ChromeDriver();
	  
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void Method2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }
  
  @Test
  public void Method3() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
  }
  
  @Test
  public void Method4() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://ww1.gogoanime2.org/watch/kimetsu-no-yaiba-dub/24");
	  driver.manage().window().maximize();
  }
}
