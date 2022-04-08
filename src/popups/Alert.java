package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		Thread.sleep(2000);
		
		WebElement alert_button = driver.findElement(By.id("alertButton"));
		
		alert_button.click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		

	}

}
