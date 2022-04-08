package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creating_on_OS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vctcpune.com");
//		Thread.sleep(2000);
//		
//		
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		Thread.sleep(2000);
//		
//		
		
		
		
		System.out.println(driver.getCurrentUrl());
		

	}

}
