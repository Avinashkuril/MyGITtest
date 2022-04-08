package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityProperties {
	
	
	public static void screenshot(WebDriver driver,int TCID) throws IOException {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dst= new File("D:\\Selenium\\screenshot\\screenshot "+TCID+" .jpg");
		
		org.openqa.selenium.io.FileHandler.copy(scr, dst);
	}
	
	public static String getDataFromPropertyFile(String data) throws IOException {
		
		Properties pro= new Properties();
		FileInputStream myFile= new FileInputStream("C:\\Users\\Avinash\\eclipse-workspace\\11th_Dec\\MyFile.properties");
		pro.load(myFile);
		String value = pro.getProperty(data);
		return value;
	}
}
