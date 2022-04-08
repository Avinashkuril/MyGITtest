package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/dragndrop/");
		
		Thread.sleep(5000);
		
		WebElement dragBox = driver.findElement(By.id("draggable"));
		
		WebElement dropBox = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(dragBox).moveToElement(dropBox).release().perform();

	}

}
