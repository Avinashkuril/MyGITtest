package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClicknDeclick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement w:checkBoxes) {
			w.click();
			Thread.sleep(500);
		}
		
		for(WebElement v:checkBoxes) {
			v.click();
			Thread.sleep(500);
		}

	}

}
