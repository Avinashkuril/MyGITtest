package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		String text;
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
//		List<WebElement> tableHeader = driver.findElements(By.xpath("//table//th"));
//		for(WebElement w:tableHeader) {
//			System.out.print(w.getText()+" || ");
//		}
//		System.out.println();
		
		
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='product']//tr"));
		
		int tableDataSize = tableData.size();
		
		for(int i=1;i<=tableDataSize;i++) {
		
			text=driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]")).getText();
			System.out.println(text);
		
		}
	}
		

}
