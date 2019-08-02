package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.Login;
import utility.BrowserFactory;

public class LoginTestCase {
  @Test
  public void f() {
	  
	  WebDriver driver=BrowserFactory.startBrowser("firefox", "http://demoaut.com/");
	  Login log=new Login(driver);
	  log.loginuser("tutorial", "tutorial");
  }
}
