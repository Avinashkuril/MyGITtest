package selenium;

import java.awt.Point;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SetPosition {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(100, 60);
		
		driver.manage().window().setPosition(p);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dsnt= new File("D:\\Selenium\\screenshot//SetPosition.jpg");
		
		FileHandler.copy(source, dsnt);

	}

}
