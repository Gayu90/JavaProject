package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderEx {
	WebDriver driver;
	SoftAssert softassert; 
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider = "textmessage",dataProviderClass =Data.class)
	public void verifyMess(String text)
	{
		SoftAssert softassert = new SoftAssert();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		WebElement Message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		Message.sendKeys(text);
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=yourMessage.getText();
		String[] expectedmess= {"Allianz","Infosys","Techversant","Quest"};
		softassert.assertEquals(actualMessage,expectedmess);
			System.out.println(actualMessage);
		
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	
}
