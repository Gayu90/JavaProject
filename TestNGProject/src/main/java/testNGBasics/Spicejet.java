package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {
	WebDriver driver;

	@BeforeMethod

	public void beforemethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		//driver.manage().window().maximize();
		
	}
	@Test
	public void verifyUrl_Spicejet()
	{
		String expectedUrl="https://www.spicejet.com/";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl,"Url is not working");
		System.out.println(actualUrl);
		
	}
	@Test
	public void verifyTitle_Spicejet()
	{
		String expectedTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle,"Title is wrong");
		System.out.println(actualTitle);
	}
	@Test

	public void verifySearchButtonColor()
	{
		WebElement searchButton=driver.findElement(By.xpath("//div[text()='Search Flight']"));
		String actualcolor=searchButton.getCssValue("background-color");
		String expectedcolor="rgba(0, 0, 0, 0)";
		Assert.assertEquals(actualcolor, expectedcolor,"Background color is not matching");
      
	}
	@Test
	public void switchFrame()
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");	
	//driver.switchTo().frame(1);
	driver.switchTo().frame("frame-bottom");
	WebElement frameBottom=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
	System.out.println(frameBottom.getText());
	}
	
	@Test
    
	public void SwitchFrameTop()
	{
		driver.get("https://the-internet.herokuapp.com/nested_frames");	
		driver.switchTo().frame("frame-Top");
	}
}
		
	
	

