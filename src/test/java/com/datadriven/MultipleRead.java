package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleRead {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Kanisri\\eclipse-workspace\\MavenProject\\Excel\\Marksheets.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int row = sheet.getLastRowNum();
		int cell = sheet.getRow(1).getLastCellNum();
		
		for (int r=0; r<=row; r++) {
			
			XSSFRow row2 = sheet.getRow(r);
			
			for (int c=0; c<cell; c++) {
				
				XSSFCell cell2 = row2.getCell(c);
				switch (cell2.getCellType()) {
				
				case STRING: System.out.println(cell2.getStringCellValue());
				break;
									
				case NUMERIC: System.out.println(cell2.getNumericCellValue());
				break;
				
				case BOOLEAN: System.out.println(cell2.getBooleanCellValue());
				break;
				
				case FORMULA: System.out.println(cell2.getCellFormula());
				break;
				
				}
				
				System.out.println(" || ");				
			}
			System.out.println();
		}
					
		
	}

}
