package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ajax {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\chromedriver_win32_\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
	   By container=By.cssSelector(".demo-container");
	   WebDriverWait wait=new WebDriverWait(driver,5);
	   wait.until(ExpectedConditions.presenceOfElementLocated(container));
	   
	   
	   WebElement noDatesTextElement= driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	   String textbeforeajaxcall=noDatesTextElement.getText().trim();
	   
	   
	   driver.findElement(By.linkText("2")).click();
	   
	   By loader=By.className("raDiv");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(loader));
	   
	   
	   WebElement DatesTextElement= driver.findElement(By.xpath("//div[@class='RadAjaxPanel']/span"));
	   WebDriverWait wait1=new WebDriverWait(driver,30);
	   wait1.until(ExpectedConditions.visibilityOf(DatesTextElement));
	   String textafterajaxcall=DatesTextElement.getText().trim();
	   
	   System.out.println(textbeforeajaxcall);
	   System.out.println(textafterajaxcall);


	  
  }
}
