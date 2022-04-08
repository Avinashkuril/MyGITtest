package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enabled {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		String welcome_text = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println(welcome_text);
		Thread.sleep(1000);
		
		
		
		String expected_text= "Welcome To Practice Pag";
		
		if(welcome_text.equals(expected_text)){
			
			System.out.println("the text equals is passed");
			
			
		}
		else {
			System.out.println("It failed");
		}
		
		

	}

}
