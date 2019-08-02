package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageUsingPageFactory {
//optimized way of functionality usage
	
	WebDriver driver;
	public  LoginPageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(how=How.XPATH,using="//a[@href='login.htm']")
	WebElement signin;
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement username;
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement password;
	@FindBy(how=How.XPATH,using="//input[@name='Login']")
	WebElement login;

	public void loginuser(String un,String pass) {
		signin.click();
		username.sendKeys(un);
		password.sendKeys(pass);
		login.click();

	}
}
