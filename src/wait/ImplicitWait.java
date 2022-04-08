package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://ww1.gogoanime2.org/watch/kimetsu-no-yaiba-dub/24");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

	}

}
