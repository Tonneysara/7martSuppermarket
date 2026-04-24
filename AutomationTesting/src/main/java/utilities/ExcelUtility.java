package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Constant;

public class ExcelUtility {

	static FileInputStream f; // read excel file
	static XSSFWorkbook wb; // represent entire workbook
	static XSSFSheet sh; // represent a single sheet

	public static String readStringData(int row, int col, String sheet) throws IOException {

		f = new FileInputStream(Constant.EXCELPATH);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);

		XSSFRow r = sh.getRow(row); // get row based on row number
		XSSFCell c = r.getCell(col); // get cell based on column number

		return c.getStringCellValue(); // return string/text from that cell
	}

	public static String readIntegerData(int row, int col, String sheet) throws IOException {

		f = new FileInputStream(Constant.EXCELPATH);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);

		XSSFRow r = sh.getRow(row);
		XSSFCell c = r.getCell(col);

		int val = (int) c.getNumericCellValue(); // convert double to int
		return String.valueOf(val); // convert int to string
	}
}

