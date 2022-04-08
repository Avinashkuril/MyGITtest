package selenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_clickme {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("iframeResult");
		
		WebElement clickmebutton = driver.findElement(By.xpath("//button[@type='button']"));
		
		clickmebutton.click();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination= new File("D:\\Selenium\\screenshot//scr.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(source, destination);
		
		driver.switchTo().parentFrame();
		
		WebElement changetheme = driver.findElement(By.xpath("//a[@title='Change Theme']"));
		
		changetheme.click();
		
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dstn= new File("D:\\Selenium\\screenshot//scr2.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(source1, dstn);
		
		
		
		
		
		
		

	}

}
