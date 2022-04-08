package selenium;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SetSize {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(5000);
		
		org.openqa.selenium.Dimension d= new org.openqa.selenium.Dimension(500, 900);
		
		driver.manage().window().setSize(d);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dntn= new File("D:\\Selenium\\screenshot//SetSize.jpg");
		
		FileHandler.copy(source, dntn);
		

	}

}
