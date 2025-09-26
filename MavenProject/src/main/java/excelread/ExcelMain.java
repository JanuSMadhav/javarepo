package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s=ExcelCode.readStringData(1, 0);// method is declared in ExcelCode method. to get data data from row
		System.out.println(s);
		String s1=ExcelCode.readIntegerData(1, 1);//data from column
		System.out.println(s1);
		

	}

}
//title will not be returned for Integer data.therefore (1,0) and (1,1) are given