package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class By_locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("email")).sendKeys("Mr. 17");
		
		Thread.sleep(1000);
		
		//driver.manage().window().minimize();
		
		driver.findElement(By.id("pass")).sendKeys("4621");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("pass")).sendKeys("5555");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}	

}
