package collection;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("lamborghini urus ma");
		
		Thread.sleep(1000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[1]//li[@role='presentation']"));
		
		
		
		System.out.println(allOptions.size());
		
		for(WebElement w:allOptions) {
			System.out.println(w.getText());
			
			String actualResult = w.getText();
			
			
			String expectedResult = "lamborghini urus mansory";
			
			if(actualResult.equals(expectedResult)) {
				
				w.click();
				break;
				
	}	
		}
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Images")).click();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dstn=new File("D:\\Selenium\\screenshot//img.jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(source, dstn);
		

	}

}
