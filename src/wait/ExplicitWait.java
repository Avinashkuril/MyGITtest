package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement otpButton= driver.findElement(By.name("mobileNumber"));
		otpButton.sendKeys("9999999999");
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofMillis(1000));
		w.until(ExpectedConditions.visibilityOf(otpButton));
		driver.findElement(By.xpath("//button[text()='Get OTP']")).click();
		
		
	}

}
