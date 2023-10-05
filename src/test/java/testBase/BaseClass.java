package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();// to launch the browser
		driver.manage().deleteAllCookies();//to delete all cookies from browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//to avoid synchronization
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		
		
	}
	@AfterClass
	public void teardown() 
	{
		//driver.close();
	}

	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
}

