package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.LoginPageUsingPageFactory;
import utility.BrowserFactory;

public class LoginPageFactoryTestCase {
  @Test
  public void f() {
	  WebDriver driver=BrowserFactory.startBrowser("chrome","http://10.232.237.143:443/TestMeApp/");
	  LoginPageUsingPageFactory log=PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
	  log.loginuser("Admin", "Password456");
  }
}
