package Selenium_Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Fetching_Value_DDT {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Asus\\eclipse-workspace");
		Workbook w1=WorkbookFactory.create(f1);
		
				//for username -fetching the value from excel sheet (first way)
				/*Sheet s1=w1.getSheet("login"); 
				Row r1=s1.getRow(2);
				Cell c1=r1.getCell(0);
				String username=c1.getStringCellValue();
				System.out.println(username);
				
				//for password
				Row r2=s1.getRow(2);
				Cell c2=r2.getCell(1);
				String password=c2.getStringCellValue();
				System.out.println(password);*/
				//String username=w1.getSheet("login").getRow(2).getCell(0).getStringCellValue();
				String username= NumberToTextConverter.toText(w1.getSheet("login").getRow(2).getCell(0).getNumericCellValue());
				
				String password = w1.getSheet("login").getRow(2).getCell(1).getStringCellValue();
	}

}
