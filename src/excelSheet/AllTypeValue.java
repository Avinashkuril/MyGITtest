package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import condition.Else_if;

public class AllTypeValue {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream Myfile= new FileInputStream("D:\\Selenium\\Book1.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		int lastRow = mySheet.getLastRowNum();
		int lastCell = mySheet.getRow(0).getLastCellNum();
		
		
		
		for(int i=0;i<=lastRow;i++) {
			for(int j=0;j<=lastCell-1;j++) {
				CellType type = mySheet.getRow(i).getCell(j).getCellType();
				Cell value = mySheet.getRow(i).getCell(j);
				if(type==CellType.STRING) {
					System.out.print(value+" ");
				}
				else if(type==CellType.NUMERIC){
					System.out.print(value+" ");
				}
				else if (type==CellType.BOOLEAN) {
					System.out.print(value+" ");
				}
				
			}
			System.out.println();
		}
	}

	
		
	}


