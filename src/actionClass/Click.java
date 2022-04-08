package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		WebElement checkBoxOption1 = driver.findElement(By.name("checkBoxOption1"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		js.executeScript("arguments[0].scrollIntoView();",checkBoxOption1);
		
		Actions a= new Actions(driver);
		
		a.moveToElement(checkBoxOption1).click().perform();
			

	}

}
