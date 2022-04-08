package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.name("email"));
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("komal123");
		Thread.sleep(2000);
		driver.findElement(By.name("email"));
		driver.findElement(By.id("email")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.className("inputtext_55r1_6luy")).sendKeys("1267");
		driver.findElement(By.tagName("button")).click();
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("1234");
		UserName.clear();
		UserName.sendKeys("komal1223");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234k");
		driver.findElement(By.linkText("forgotten password")).clear();
		driver.findElement(By.partialLinkText("paasord!!")).clear();
			
	}

}
