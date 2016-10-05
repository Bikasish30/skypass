package com.immidart.skypassTravel.genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	private static DataFormatter df;
	private static String dataFile = SkypassConstraint.testDataExcel;
	private static FileInputStream fis;
	private static XSSFWorkbook wb;
	private static XSSFSheet sh;
	private int noOfRows;
	private int columnNumber;
	public List<String> data;

	public static int getRows(String sheetName) throws IOException {
		fis = new FileInputStream(dataFile);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetName);
		return sh.getLastRowNum();
	}

	public static int getColumnsPresentInARow(int rowNumber, String sheetName) throws IOException {
		fis = new FileInputStream(dataFile);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet(sheetName);
		return sh.getRow(rowNumber).getLastCellNum();
	}

	public void getTesData(String sheetName) {		
		try {
			fis = new FileInputStream(dataFile);
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

		sh = wb.getSheet(sheetName);
		df = new DataFormatter();
		data = new ArrayList<String>();

		try {
			noOfRows = ExcelDataReader.getRows(sheetName);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 1; i <= noOfRows; i++) {

			try {
				columnNumber = ExcelDataReader.getColumnsPresentInARow(i, sheetName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for (int j = 0; j < columnNumber; j++) {
				data.add(df.formatCellValue(sh.getRow(i).getCell(j)));
			}
		}
	}

}
