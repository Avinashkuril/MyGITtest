package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		List<WebElement> headersList = driver.findElements(By.xpath("//table[@id='product']//th"));
		
		for(WebElement w:headersList) {
			System.out.print(w.getText()+"--");
		}
		
		List<WebElement> row = driver.findElements(By.xpath("(//table[@id='product']//tr)[2]"));
		System.out.println();
		for(WebElement r:row) {
			System.out.print(r.getText()+" -- ");
		}
		
		

	}

}
