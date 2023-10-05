package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver)
	{
		super(driver);//to invoke the parent class constructor
	}

	//locator

@FindBy(xpath="//button[normalize-space()='Get Started']") 

WebElement lnkGetstarted;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(xpath="//a[normalize-space()='Sign in']")
WebElement signin;

//Actions to be performed
public void clickGetStarted() 
{
	lnkGetstarted.click();
	
	
}
public void clickRegister()
{
	lnkRegister.click();
}
public void clicksignin() 
{
	signin.click();
}
}
