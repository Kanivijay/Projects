package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void main(String[] args) throws IOException {
		
		File write = new File("C:\\Users\\Kanisri\\eclipse-workspace\\MavenProject\\Excel\\Marksheets.xlsx");
		FileInputStream data = new FileInputStream(write);
		Workbook workbook = new XSSFWorkbook(data);
        Sheet sheet = workbook.createSheet("Credentials");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue("UserName");
        
        Sheet sheet2 = workbook.getSheet("Credentials");
        Row row2 = sheet2.getRow(0);
        Cell cell2 = row2.createCell(1);
        cell2.setCellValue("Password");
        
        workbook.getSheet("Credentials").createRow(1).createCell(0).setCellValue("Kani");
        
        
        FileOutputStream write_data = new FileOutputStream(write);
        workbook.write(write_data);
        workbook.close();     
        
	}
}
