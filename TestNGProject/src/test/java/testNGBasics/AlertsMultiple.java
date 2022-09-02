package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsMultiple {
	WebDriver driver;
	 SoftAssert softassert;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-alert.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyMultipleAlertText()
	{
		SoftAssert softassert = new SoftAssert();
		WebElement autoclosableButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		autoclosableButton.click();
		WebElement autoclosableAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-success alert-autoclosable-success']"));
		String actualAlerttext=autoclosableAlertmess.getText();
		String expectedAlerttext=("I'm an autoclosable success message. I will hide in 5 seconds.");
		softassert.assertEquals(actualAlerttext, expectedAlerttext);
		System.out.println(actualAlerttext);
		WebElement normalSuccessButton=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		normalSuccessButton.click();
		WebElement normalSuccessAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']"));
		String actualnormalSuccesstext=normalSuccessAlertmess.getText();
		WebElement closebutton=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//button"));
		closebutton.click();
		System.out.println(actualnormalSuccesstext);
		String expectednormalSuccesstext=("×\n" + 
				"I'm a normal success message. To close use the appropriate button."); 
	
		softassert.assertEquals(actualnormalSuccesstext, expectednormalSuccesstext);
		WebElement autocloseWarningButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		autocloseWarningButton.click();
		WebElement autoWarningAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-warning alert-autoclosable-warning']"));
		String actualWarningAlertText=autoWarningAlertmess.getText();
		
		String expectedwarningText="I'm an autoclosable warning message. I will hide in 5 seconds.";
		softassert.assertEquals(actualWarningAlertText, expectedwarningText);
		System.out.println(actualWarningAlertText);
		WebElement normalWarningButton=driver.findElement(By.xpath("//button[@id='normal-btn-warning']"));
		normalWarningButton.click();
		WebElement normalWarningAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']"));
		String actualnormalWarningAlertText=normalWarningAlertmess.getText();
		WebElement closebutton1=driver.findElement(By.xpath("//div[@class='alert alert-warning alert-normal-warning']//button"));
		closebutton1.click();
		String expectedNormalwarningText=("×\n" + 
				"I'm a normal warning message. To close use the appropriate button.");
		System.out.println(actualnormalWarningAlertText);
		softassert.assertEquals(actualnormalWarningAlertText, expectedNormalwarningText);
		WebElement autoClosableDangerButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-danger']"));
		autoClosableDangerButton.click();
		WebElement autoClsableDangerAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-autoclosable-danger']"));
		String actualAutodangerAlertText=autoClsableDangerAlertmess.getText();
		String expectedAutoDangerAlertText="I'm an autoclosable danger message. I will hide in 5 seconds.";
		softassert.assertEquals(actualAutodangerAlertText, expectedAutoDangerAlertText);
		System.out.println(actualAutodangerAlertText);
		WebElement normalClosableDangerButton=driver.findElement(By.xpath("//button[@id='normal-btn-danger']"));
		normalClosableDangerButton.click();
		WebElement normalClsableDangerAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']"));
		String actualdangerAlertText=normalClsableDangerAlertmess.getText();
		WebElement closebutton2=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-normal-danger']//button"));
		closebutton2.click();
		String expecteddangerAlertText=("×\n" + 
				"I'm a normal danger message. To close use the appropriate button.");
		softassert.assertEquals(actualdangerAlertText, expecteddangerAlertText);
		System.out.println(actualdangerAlertText);
		WebElement autoinfoButton=driver.findElement(By.xpath("//button[@id='autoclosable-btn-info']"));
		autoinfoButton.click();
		WebElement actualAutoInfoAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-info alert-autoclosable-info']"));
		String actualAutoInfoAlertText=actualAutoInfoAlertmess.getText();
		String expectedAutoInfotext="I'm an autoclosable info message. I will hide in 5 seconds.";
		softassert.assertEquals(actualAutoInfoAlertText, expectedAutoInfotext);
		System.out.println(actualAutoInfoAlertText);
		softassert.assertAll();
		WebElement normalinfoButton=driver.findElement(By.xpath("//button[@id='normal-btn-info']"));
		normalinfoButton.click();
		WebElement normalInfoAlertmess=driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']"));
		String normalInfoAlertText=normalInfoAlertmess.getText();
		WebElement closebutton3=driver.findElement(By.xpath("//div[@class='alert alert-info alert-normal-info']//button"));
		closebutton3.click();
		String expectedInfoAlertText="×\n" + 
				"I'm a normal info message. To close use the appropriate button.";
		softassert.assertEquals(normalInfoAlertText, expectedInfoAlertText);
		System.out.println(normalInfoAlertText);
		softassert.assertAll();
		
			
					}
	
}










