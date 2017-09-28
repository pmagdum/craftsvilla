package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 

{
	
	public static String getCellValue(String xlpath, String sheetName, int r, int c)
	{
		try
		{
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet s = wb.getSheet(sheetName);
			
			String data = s.getRow(r).getCell(c).getStringCellValue();
			return data;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return " ";
		}
	}

}
