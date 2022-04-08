package utility_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	public static String excelSheet(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream myFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String sheetValues = mySheet.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		return sheetValues;
		
	}
	
	public static void screenshot(WebDriver driver, int TCID) throws IOException {
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dstn= new File("D:\\Selenium\\screenshot\\screenshot "+TCID+" TC.jpg");
		
		org.openqa.selenium.io.FileHandler.copy(scr, dstn);
	}
 
}
