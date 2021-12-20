package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider_FBAccount {
	
	@DataProvider(name="testcase1")
	public static String[][] getData() throws IOException {
		FileInputStream fis= new FileInputStream("./Testdata/test1.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rc=sheet.getLastRowNum();
		int cc= sheet.getRow(0).getLastCellNum();
		
		String[][] testdata= new String[rc][cc];
		//testdata[0][0]= sheet.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(testdata[0][0]);
		for(int i=1;i<=rc;i++) {
			XSSFRow row= sheet.getRow(i);
			for(int j=0;j<cc;j++) {
				String data=row.getCell(j).getStringCellValue();
		testdata[i-1][j]=data;
			System.out.println("row="+i+"coloumn="+j+" data="+data);
			
			}
			
	
	
	}
		return testdata;
}
	
	

}
