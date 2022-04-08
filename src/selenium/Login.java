package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mr. 17");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abc@12");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	}

}
