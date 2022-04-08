package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=2;j++) {
			
		System.out.print(MySheet.getRow(i).getCell(j).getStringCellValue()+" ");
		}
			System.out.println();
	}
		
		System.out.println(MySheet.getLastRowNum());
		System.out.println(MySheet.getRow(0).getLastCellNum());
	}
}
