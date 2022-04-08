package excelSheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expected_ActualOnWebpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("userid")).sendKeys("DAA677");
		driver.findElement(By.id("password")).sendKeys("Velocity@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("pin")).sendKeys("866918");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		String actualText = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expectedText = "DAA677";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Correct user");
			driver.findElement(By.xpath("//span[@class='user-id']")).click();
			driver.findElement(By.xpath("//a[@target='_self']")).click();
		}
		else {
			System.out.println("Incorrect user");
		}
	}

}