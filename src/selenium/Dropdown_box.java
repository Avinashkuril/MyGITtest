package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_box {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select s= new Select(dropdown);
		
		boolean result = s.isMultiple();
		
		System.out.println("The reult is "+result);
		
		Thread.sleep(1000);
		
		s.selectByValue("volvo");
		
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		
		s.selectByVisibleText("Audi");
		
		s.deselectByIndex(2);
		
		
		
	}

}
