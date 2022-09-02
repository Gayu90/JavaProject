package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserttypes {
	WebDriver driver;
	  SoftAssert softassert;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyAmazon()
	{
		SoftAssert softassert = new SoftAssert();
	    String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	    String actualTitle=driver.getTitle();
	    System.out.println("actualtitle:"+actualTitle);
	    String expectedUrl="https://www.amazon.in/";
	    String actualUrl=driver.getCurrentUrl();
	    softassert.assertEquals(actualUrl, expectedUrl);
	    softassert.assertEquals(actualTitle, expectedTitle);
	    System.out.println("Test case executed successfully");
	    softassert.assertAll();
	 
	    
	  
	    
	}
	}

