package com.test.utility;

import java.util.ArrayList;
//call to read data from excel
public class TestUtil {
	
	
	public static ArrayList<Object[]> getDatafromExcel()
	{
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		Xls_Reader reader = new Xls_Reader("..\\automation\\src\\main\\resources\\data.xlsx");
		for(int rowNum=2;rowNum<=reader.getRowCount("Sheet1");rowNum++)
		{
			String url = reader.getCellData("Sheet1", "url", rowNum);
			String emailid= reader.getCellData("Sheet1", "emailId", rowNum);
			Object obj[] = {url,emailid};
			mydata.add(obj);
		}
				
		return mydata;
	}

}
