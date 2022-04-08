package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement OpenWindow = driver.findElement(By.id("openwindow"));
		
		OpenWindow.click();
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeAsyncScript("arguments[0].scrollIntoView();",OpenWindow);
	}

}
