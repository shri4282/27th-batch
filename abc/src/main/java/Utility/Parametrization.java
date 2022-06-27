package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization 
{
	public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\windows\\eclipse-workspace\\abc\\src\\test\\resources\\Credentials.xlsx");
	String value = WorkbookFactory.create(file).getSheet("data").getRow(row).getCell(cell).getStringCellValue();
	
	System.out.println(value);
	return value;

}

	
	}

	
	




	