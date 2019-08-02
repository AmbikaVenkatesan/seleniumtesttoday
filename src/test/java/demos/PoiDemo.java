package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PoiDemo {
  @Test
  public void f() throws IOException {
	  File src=new File("C://Selenium 3.0//Book1.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  int i=0;
	  int j=0;
	  int k=sheet1.getLastRowNum();
	   for(i=0;i<=k;i++) {
		   for(j=0;j<=1;j++) {
		   String username=sheet1.getRow(i).getCell(j).getStringCellValue();
		   j++;
		   String password=sheet1.getRow(i).getCell(j).getStringCellValue();
		   System.out.println(username +" and " +password);
 
	   }
	
	  
	   }
	  
	 // String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
	//  System.out.println("Data from excel row0 is: " +data0);
	 // 
	  
	  
	 // String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
	//  System.out.println("Data from excel row0 is: " +data1);
	  
	  
	  wb.close();
	  
	  
  }
}
