package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMeAppRegistration {
	WebDriver driver;
	String expectedresult="User Registered Succesfully!!! Please login";
	By signup=By.xpath("//a[@href='RegisterUser.htm']");
	By username=By.name("userName");
	By firstname=By.name("firstName");
	By lastname=By.name("lastName");
	By password=By.name("password");
	By confirmpassword=By.name("confirmPassword");
	By gender=By.xpath("//input[@value='Female']");
    By emailAddress=By.name("emailAddress");
	By mobilenumber=By.name("mobileNumber");
	By dobb=By.name("dob");
	By addresss=By.name("address");
	By securityQuestion=By.xpath("//select[@name='securityQuestion']/option[4]");
	By answer=By.name("answer");
	By submit=By.xpath("//input[@type='submit']");
	//String msg=driver.findElement(By.xpath("//*[@id='errormsg'][4]")).getText();
	//By msg=By.xpath("//*[@id='errormsg'][4]");
public TestMeAppRegistration(WebDriver driver)
{
	 this.driver=driver;
	 
}
public void registeruser(String un,String fn, String ln, String pass,String confpass,
		String email, String mn, String dob,String address, String ans) {
	driver.findElement(signup).click();

	driver.findElement(username).sendKeys(un);
	driver.findElement(firstname).sendKeys(fn);
	driver.findElement(lastname).sendKeys(ln);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(confirmpassword).sendKeys(confpass);
	driver.findElement(gender).click();
	driver.findElement(emailAddress).sendKeys(email);
	driver.findElement(mobilenumber).sendKeys(mn);
	driver.findElement(dobb).sendKeys(dob);
	driver.findElement(addresss).sendKeys(address);
	driver.findElement(securityQuestion).click();
	driver.findElement(answer).sendKeys(ans);
	
	driver.findElement(submit).click();
	//driver.findElement(msg).getText();
	




}}