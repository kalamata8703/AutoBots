package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignIn;
import testBase.BaseClass;

public class TC_002_SignInPage extends BaseClass 
{

@Test
public void test_signinpage()
{
	HomePage hp=new HomePage(driver);
	hp.clickGetStarted();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	hp.clicksignin();
SignIn si=new SignIn(driver);
	
	si.username("swathi18");
	si.password("Welcome$123");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	si.submit();
//String se=	driver.getTitle();
//System.out.println(se);*/
	
}

}
