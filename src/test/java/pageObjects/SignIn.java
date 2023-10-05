package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends BasePage
{
	WebDriver driver;
	
	 public SignIn(WebDriver driver)
	{
	super(driver);
		
	}
	 @FindBy(xpath="//input[@name='username']")
	 WebElement txtusrname;
	 @FindBy(xpath="//input[@id='id_password']") 
	 WebElement txtpwd;
	 @FindBy(xpath="//input[@type='submit']")
	 WebElement sbmt;
	 public void username(String username) 
	 {
		 txtusrname.sendKeys(username);
		 		
		 
	 }
	 public void password(String password)
	 {
		 txtpwd.sendKeys(password);
	 }
	 public void submit() {
		 
		 sbmt.click();
	 }
	 




	 
	 
}
