package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable_use {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		Thread.sleep(2000);
		
		boolean actual = driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
		
		if(actual){
			
			System.out.println("The button is enabled");
			
		}
		else {
			driver.findElement(By.name("mobileNumber")).sendKeys("9915151515");
			driver.findElement(By.xpath("//button[text()='Get OTP']")).isEnabled();
			System.out.println("The button is now enabled");
		}
		
		

	}

}
