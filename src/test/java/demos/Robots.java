package demos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robots {
  @Test
  public void f() throws AWTException {
	  Robot robot = new Robot();
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32_\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
		  driver.get("file:///C:/Selenium 3.0/fileupload.html");
		  driver.findElement(By.xpath("//input[@type=\'file\']")).click();
		  robot.delay(1000);

		  //String path="C:\\Users\\Training_c2d.02.11\\Documents\\athii.docx";
		  String path="C:\\TestMeFinaal\\TestMeApp_Software_Setup_PG.docx";
				  StringSelection sel=new StringSelection(path);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		  robot.delay(1000);
		  robot.keyPress(KeyEvent.VK_CONTROL);
		  robot.keyPress(KeyEvent.VK_V);
		  
		  robot.keyRelease(KeyEvent.VK_CONTROL);
		  robot.keyRelease(KeyEvent.VK_V);
		  
		  robot.delay(1000);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  robot.keyPress(KeyEvent.VK_ENTER);
		  
	 
	


  }
}
