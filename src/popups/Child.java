package popups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		String ParentWindow = driver.getWindowHandle();
		
		System.out.println("the id of parent window is "+ParentWindow);
		
		WebElement windowbutton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		
		windowbutton.click();
		
		Set<String> AllWindowsID= driver.getWindowHandles();
		
		System.out.println("all windows ids are "+AllWindowsID);
		
		//Iterator<String> it=AllWindowsID.iterator();//-1
		
		ArrayList<String> al=new ArrayList<String>(AllWindowsID);
		
//		String MainPageId= it.next();//-1+1=0
//		
//		String ChildWindow1= it.next();//0+1=1
		
		String mainPage = al.get(0);
		
		String childwin = al.get(1);
		
		driver.switchTo().window(childwin);
		
//		driver.switchTo().window(ChildWindow1);
//		
//		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Selenium\\screenshot//screenshot_ChildPopup.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(source, destination);

	}

}
