package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataex {
	
	public static String[][] readData(String excelName) throws IOException {
		
		XSSFWorkbook wrkbook =new XSSFWorkbook("data/"+excelName+".xlsx");
		XSSFSheet sheet = wrkbook.getSheetAt(0);
		int rowCount= sheet.getLastRowNum();
		short columnCount =sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String [rowCount][columnCount];
		
		System.out.println("Row Count "+rowCount);
		System.out.println("Column Count "+columnCount);
		
		XSSFRow firstDataRow =sheet.getRow(1);
		XSSFCell companyName =firstDataRow.getCell(0);
		System.out.println(companyName.getStringCellValue());
		
		for (int i =1; i <= rowCount; i++) {
			XSSFRow row =sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell =row.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j]=cell.getStringCellValue();
			 
				
			}
			
		}
		
		wrkbook.close();
		return data;
		
	}

}
