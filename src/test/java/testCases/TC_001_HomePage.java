package testCases;
//setup method ,teardownmethod

import java.time.Duration;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Registration;
import pageObjects.SignIn;
import testBase.BaseClass;

public class TC_001_HomePage extends BaseClass
{

//To execute only once we use beforeclass method.

@Test
public void test_getstarted()
{
	HomePage hp=new HomePage(driver);
	
	hp.clickGetStarted();
	
	
	Registration reg=new Registration(driver);//another class object
	/*reg.setUsername("swathi30");
	reg.setPassword("Swathi@30");
	reg.setConfirmpassword("Swathi@30");*/
	reg.setUsername(randomeString().toUpperCase());
	String password=randomAlphaNumeric();
	
	reg.setPassword(password);
	reg.setConfirmpassword(password);
	
	reg.setRegister();
	
	}

}
