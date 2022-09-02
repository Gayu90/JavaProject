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

public class AlertAssertExample {
	WebDriver driver;
	 SoftAssert softassert;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyAlerttext()
	{
	SoftAssert softassert = new SoftAssert();
    WebElement jsAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
    jsAlert.click();
    String actualjsAlerttext=driver.switchTo().alert().getText();
    String expectedJSAlerttext="I am a JS Alert";
    softassert.assertEquals(actualjsAlerttext, expectedJSAlerttext );
    System.out.println("Testcase 1 verified"+" "+actualjsAlerttext);
    driver.switchTo().alert().accept();
    WebElement jsConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
    jsConfirm.click();
    String actualjsConfirmtext=driver.switchTo().alert().getText();
    String expectedJSConfirmtext="I am a JS Confirm";
    softassert.assertEquals(actualjsConfirmtext, expectedJSConfirmtext );
    System.out.println("Testcase 2 verified"+" "+actualjsConfirmtext);
    driver.switchTo().alert().accept();
    softassert.assertAll();
    
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	
}
