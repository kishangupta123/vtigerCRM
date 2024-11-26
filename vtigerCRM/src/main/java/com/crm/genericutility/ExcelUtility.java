package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Kishan Kumar Gupta
 * 
 */
public class ExcelUtility {
	/**
	 * This method is used to read string data from excel
	 * User must pass sheetName, rowIndex, colIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream  fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();	
	}
	
	/**
	 * This method is used to read boolean data from excel
	 * User must pass sheetName, rowIndex, colIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream  fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();	
	}
	
	/**
	 * This method is used to read numeric data from excel
	 * User must pass sheetName, rowIndex, colIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumericDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream  fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();	
	}
	
	/**
	 * This method is used to read LocalDateTime data from excel file
	 * User must pass sheetName, rowIndex, colIndex
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream  fis = new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();	
	}
}
