package scroll;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		//driver.manage().window().maximize();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("window.scrollBy(0,200)");
		
		WebElement PromtButton = driver.findElement(By.id("promtButton"));
		
		PromtButton.click();
		
		
		
		

	}

}
