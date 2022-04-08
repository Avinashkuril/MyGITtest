package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_ex2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Mr. 17");
		
		driver.findElement(By.name("lastname")).sendKeys("  ");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8888888888");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'New')]")).sendKeys("1234");
		
		WebElement day = driver.findElement(By.id("day"));	
		
		Select a=new Select(day);
		
		a.selectByVisibleText("26");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select b=new Select(month);
		
		b.selectByIndex(1);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select c=new Select(year);
		
		c.selectByValue("1996");
		
		driver.findElement(By.linkText("Male")).click();
		
	}

}
