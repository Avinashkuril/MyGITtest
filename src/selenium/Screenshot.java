package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random = RandomString.make(2);
		
		File destination = new File("D:\\Selenium\\screenshot//screenshot"+random+".jpg");
		
		FileHandler.copy(source, destination);

	}

}
