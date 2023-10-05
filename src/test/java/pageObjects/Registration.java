package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePage{
	WebDriver driver;
	
public	Registration(WebDriver driver)
	{
		super(driver);
	}
	

@FindBy(xpath="//input[@id='id_username']") 
WebElement txtUsername;

@FindBy(xpath="//input[@id='id_password1']") 
WebElement txtPassword;

@FindBy(xpath="//input[@id='id_password2']") 
WebElement txtConfirmPassword;

@FindBy(xpath="//input[@value='Register']") 
WebElement lnkRegister;
 
public void setUsername(String username)
{
	txtUsername.sendKeys(username);
}
public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void setConfirmpassword(String cpwd)
{
	txtConfirmPassword.sendKeys(cpwd);
}
public void setRegister()
{
	lnkRegister.click();
}

}
