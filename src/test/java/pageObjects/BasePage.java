package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//we created this basepage instead of defining the constructor in each page to acheive the code reusability we are using base page
public class BasePage 
{
	WebDriver driver;
	BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);//to initalise the page elements that we can work directly for that element to avoid null point exception.
		
	}
	
}
