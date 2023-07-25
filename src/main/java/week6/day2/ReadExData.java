package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExData {
	public static String[][] readData(String excelName) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook = new XSSFWorkbook("Data/"+excelName+".xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		short columnCount = row.getLastCellNum();
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count " + rowCount);
		System.out.println("Column count " + columnCount);
		
		String[][] data = new String[rowCount][columnCount];
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row1 = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row1.getCell(j);
				System.out.println(cell.getStringCellValue());
				data[i-1][j] = cell.getStringCellValue();
			}
			
		}
		
		workbook.close();
		return data;

	}

}

