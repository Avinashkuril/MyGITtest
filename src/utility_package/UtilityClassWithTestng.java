package utility_package;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClassWithTestng  {
	
	public static String readFromExcelSheet(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String value = mySheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return value;
	}
	
	public static void screenshot(WebDriver driver) throws IOException {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dst= new File("D:\\Selenium\\screenshot.jpg");
		org.openqa.selenium.io.FileHandler.copy(scr, dst);
	}

}
