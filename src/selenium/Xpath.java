package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver a=new ChromeDriver();
		
		a.get("https://vctcpune.com/selenium/practice.html");
		
		a.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).click();
		
		a.findElement(By.xpath("//h1[contains(text(),'Welcome To')]"));
		
		a.findElement(By.xpath("(//input[contains(@name,'radio')])[3]")).click();

	}

}
