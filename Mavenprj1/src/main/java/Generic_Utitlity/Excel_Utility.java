package Generic_Utitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility 
{
	/**
	 * this method is used to fetch data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */
	public String getExcelData(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream excldata=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(excldata);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		String result = cel.getStringCellValue();
		return result;
	}
	
	public String getExcelDataFormatter(String sheetName, int rowNum, int cellNum) throws Throwable
	{
		FileInputStream excldata=new FileInputStream("./src/test/resources/Excelsheet.xlsx");
		Workbook wb = WorkbookFactory.create(excldata);
		DataFormatter format=new DataFormatter();
		String data = format.formatCellValue(wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
		return data;
	}


}
