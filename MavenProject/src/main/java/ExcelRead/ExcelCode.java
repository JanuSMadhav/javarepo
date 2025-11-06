package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode { //created ExcelCode class

	static FileInputStream f; //static variables to access excel. To avoid creating objects, static keyword is used. Fileinputstream is a variable used to read the excel file in the system
	static XSSFWorkbook w; // XSSFWorkbook is used to represent the entire excel workbook
	static XSSFSheet sh;// XSSFSheet is used to represent a workbook sheet in excel

	public static String readStringData(int row, int col) throws IOException { //method to read string and int data. row and columns are represented by int row and int column
		f = new FileInputStream("C:\\Users\\USER\\git\\javarepo\\MavenProject\\src\\main\\resources\\ExcelData.xlsx");//to open the excel file in the given location
		w = new XSSFWorkbook(f);//excel file is loaded to memory using the help of apache poi
		sh = w.getSheet("Sheet1");//represents sheet1 of workbook
		XSSFRow r = sh.getRow(row);//to get the data in the row based on the row number 
		XSSFCell c = r.getCell(col);//to get the data in the cell based on the column number 
		return c.getStringCellValue();// get/return the data in the cell in a string format

	}

	public static String readIntegerData(int row, int col) throws IOException {// method to read the integer data
		f = new FileInputStream("C:\\Users\\USER\\git\\javarepo\\MavenProject\\src\\main\\resources\\ExcelData.xlsx");//to open the excel file in the given location
		w = new XSSFWorkbook(f);//excel file is loaded to memory using the help of apache poi
		sh = w.getSheet("Sheet1");//represents sheet1 of workbook
		XSSFRow r = sh.getRow(row);//to get the data in the row based on the row number 
		XSSFCell c = r.getCell(col);//to get the data in the cell based on the column number 
		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting, to remove decimal points
		return String.valueOf(val);   //convert int to string using valueOf() method //converting to string representation
	
	
	}

}