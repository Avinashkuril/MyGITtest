package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_selected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		
		boolean checkbox_option_key = driver.findElement(By.name("checkBoxOption1")).isSelected();
		
		if(checkbox_option_key) {
			
			System.out.println("the key is checked");
		}
		else {
			
			driver.findElement(By.name("checkBoxOption1")).click();
			System.out.println("It is clicked now");
		}
		
		
		

	}

}
