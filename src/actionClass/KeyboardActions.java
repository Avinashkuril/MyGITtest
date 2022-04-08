package actionClass;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		create.click();
		
		Actions act= new Actions(driver);
		
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		act.sendKeys("Mr. 17").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("...").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("8888888888").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Ab@123").perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("26").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Feb").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("1996").perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
		
		
		
		

	}

}
