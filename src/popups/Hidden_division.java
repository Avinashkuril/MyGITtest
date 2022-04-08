package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_division {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		WebElement closebutton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		closebutton.click();
		
		//driver.findElement(By.className("exehdJ"));
//		
//		Select dropdown= new Select(more);
//		
		WebElement cart = driver.findElement(By.linkText("Cart"));
		
		cart.click();
		
		
	}

}
