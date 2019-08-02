package demos;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32_\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.manage().window().maximize();
	   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 //  driver.findElement(By.linkText("SignIn")).click();
		 //driver.findElement(By.name("userName")).sendKeys("lalitha");
			 // driver.findElement(By.name("password")).sendKeys("Password123");
			// driver.findElement(By.name("Login")).click();
	   WebElement element= driver.findElement(By.name("products"));
	   Actions act=new Actions(driver);
act.keyDown(element, Keys.SHIFT).perform();
act.sendKeys("b").pause(3000).sendKeys("a").pause(3000).sendKeys("g").build().perform();
WebElement handbag=driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]")); 
act.moveToElement(handbag).click().build().perform();
driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
Set<String> set=driver.getWindowHandles();
for(String s:set)
{
	 driver.switchTo().window(s) ;
	 System.out.println(driver.getTitle());
	


}
String text=driver.findElement(By.xpath("//h4[contains(text(),'Hand bag')]")).getText();
System.out.println(text);
Assert.assertTrue(text.contains("Hand bag"));
	  // driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	   //driver.findElement(By.linkText("SignIn")).click();
	 //  driver.findElement(By.name("userName")).sendKeys("lalitha");
		//  driver.findElement(By.name("password")).sendKeys("Password123");
		 // driver.findElement(By.name("Login")).click();
		//WebElement element= driver.findElement(By.name("products"));
				// element.sendKeys("b");
				// element.sendKeys("a");
			//	 element.sendKeys("g");
				 


				 //  Actions act=new Actions(driver);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//WebElement handbag=driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"));
//act.moveToElement(handbag).click().build().perform();

				  // WebElement handbag=driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]/input"));

				// WebDriverWait wait=new WebDriverWait(driver, 30);
				 // wait.until(ExpectedConditions.elementToBeSelected(handbag);
				   
				  // WebElement handbag=driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div[2]/text()"));
				  // WebDriverWait wait=new WebDriverWait(driver, 30);
					// wait.until(ExpectedConditions.elementToBeSelected(handbag));
				  // Actions act=new Actions(driver);
				 

				 
	  
  }
}
