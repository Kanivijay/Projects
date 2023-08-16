package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.formula.functions.Index;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ColourData {

	public static void main(String[] args) throws Exception {
		
		File file = new File ("C:\\Users\\Kanisri\\eclipse-workspace\\MavenProject\\Excel\\Marksheets.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet("ColorData");
		XSSFRow row = sheet.createRow(3);
		
		XSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillForegroundColor(IndexedColors.AQUA.getIndex());
		cellStyle.setFillPattern(FillPatternType.ALT_BARS);
		
		XSSFCell cell = row.createCell(1);
		cell.setCellStyle(cellStyle);
		cell.setCellValue("Versatile");
		
		FileOutputStream color_file = new FileOutputStream(file);
		workbook.write(color_file);
		workbook.close();
				
	}
	
}
