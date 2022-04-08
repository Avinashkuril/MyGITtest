package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream MyFile=new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		System.out.println(MySheet.getRow(0).getCell(0).getCellType());
		
		System.out.println(MySheet.getRow(0).getCell(1).getStringCellValue());
		
		System.out.println(MySheet.getRow(0).getCell(2).getNumericCellValue());
		
	}

}
