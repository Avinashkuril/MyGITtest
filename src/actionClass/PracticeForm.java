package actionClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeForm {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		WebElement firstName = driver.findElement(By.id("firstName"));
		
		firstName.click();
		
		Actions act=new Actions(driver);
		
		act.sendKeys("Mr. 17").perform();
		
		act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("abc").keyUp(Keys.SHIFT).build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("ak@k.com").build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("8888888888").build().perform();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']")).click();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).sendKeys("10 Feb 1999").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).sendKeys("Com").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(1000);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();Thread.sleep(500);
		
		
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.SPACE).build().perform();Thread.sleep(500);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Bpq hchgcjcvjhv").build().perform();Thread.sleep(500);
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.SPACE).build().perform();
		
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dstn=new File("D:\\Selenium\\screenshot//practice.jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(source, dstn);
		Thread.sleep(1000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		File source1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dstn1=new File("D:\\Selenium\\screenshot//print.jpeg");
		
		org.openqa.selenium.io.FileHandler.copy(source1, dstn1);
	}
	

}
