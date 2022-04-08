package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Thread.sleep(2000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions a=new Actions(driver);
		
		a.click(doubleClick).doubleClick().perform();
		
		//a.moveToElement(doubleClick).doubleClick().perform();

	}

}
