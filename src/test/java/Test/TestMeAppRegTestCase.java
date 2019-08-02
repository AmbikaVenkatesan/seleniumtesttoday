package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.TestMeAppRegistration;
import utility.BrowserFactory;

public class TestMeAppRegTestCase {
  @Test
  public void f() {
	  
		String expectedresult="User Registered Succesfully!!! Please login";

			  WebDriver driver=BrowserFactory.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/");
			  TestMeAppRegistration log=new TestMeAppRegistration(driver);
			  log.registeruser("unagiross","fn", "ln", "pass@123","pass@123","S12@rmail.com", "4525652565", "12/12/2001", "no.2 street", "ambi");
			  String msg=driver.findElement(By.xpath("//*[@id='errormsg'][4]")).getText();
			  
			  Assert.assertEquals(msg,expectedresult);
				System.out.println("validated");	  
  
  
  }
	
  }

