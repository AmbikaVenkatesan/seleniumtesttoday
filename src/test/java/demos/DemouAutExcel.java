package demos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemouAutExcel {
	WebDriver driver;

  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32_\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("http://demoaut.com/");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle());
	  

	  File src=new File("C://Selenium 3.0//demoautexcel.xlsx");
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sheet1=wb.getSheetAt(0);
	  int i=0;
	  int j=0;
	  int k=sheet1.getLastRowNum();
	   for(i=1;i<=k;i++) {
		   for(j=0;j<=1;j++) {
		   String username=sheet1.getRow(i).getCell(j).getStringCellValue();
		   j++;
		   String password=sheet1.getRow(i).getCell(j).getStringCellValue();
	  
			  driver.findElement(By.name("userName")).sendKeys(username);
			  driver.findElement(By.name("password")).sendKeys(password);
			  driver.findElement(By.name("login")).click();
driver.navigate().back();
driver.findElement(By.name("userName")).clear();


	  /*String username=sheet1.getRow(1).getCell(0).getStringCellValue();
	  driver.findElement(By.name("userName")).sendKeys(username);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
	  String password=sheet1.getRow(1).getCell(1).getStringCellValue();

	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("login")).click();*/
	  wb.close();
  }
  
	   }}}
