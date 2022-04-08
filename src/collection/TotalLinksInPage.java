package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement s:totalLinks) {
			System.out.println(s.getText());
		}

	}

}
