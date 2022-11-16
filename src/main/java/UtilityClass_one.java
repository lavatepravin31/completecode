import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass_one {
	
	public static String readfromexel(int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile = new FileInputStream("E:\\excelsheet reading\\excel1.xlsx");
		
		 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet4");
		 
		String value = mysheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		 
		 return value;
	
}
	}
