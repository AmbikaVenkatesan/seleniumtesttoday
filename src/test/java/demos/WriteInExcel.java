package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteInExcel {
  @Test
  public void f() throws IOException {
	  File src=new File("C://Selenium 3.0//demoautexcel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  sheet1.getRow(0).createCell(2).setCellValue("pass");
	  sheet1.getRow(1).createCell(2).setCellValue("fail");
	  FileOutputStream fo=new FileOutputStream(src);
wb.write(fo);
	  wb.close();
  }
}
