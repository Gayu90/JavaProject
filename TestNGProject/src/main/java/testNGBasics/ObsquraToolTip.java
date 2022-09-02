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

public class ObsquraToolTip {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}

@Test

	public void verifyLikeUsOnFb()
	{
	driver.get("https://selenium.obsqurazone.com/window-popup.php");
	driver.manage().window().maximize();
	WebElement likeButton=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
	String actualToolTip1=likeButton.getAttribute("Title");
	String expectedToolTip="Follow @obsqurazone on Facebook";
	Assert.assertEquals(actualToolTip1, expectedToolTip);
	
	}
	
	@Test
	public void verifyFollowAll()
	{
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement followButton=driver.findElement(By.xpath("//a[text()='Follow All']"));
		String actualToolTip2=followButton.getAttribute("Title");
		String expectedToolTip2="Follow @obsqurazone";
		Assert.assertEquals(actualToolTip2, expectedToolTip2);
		
	}
	@Test
	public void verifyAlertText() throws InterruptedException
	{
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickmeButton=driver.findElement(By.xpath("//button[text()='Click me!']"));
		clickmeButton.click();
		Thread.sleep(3000);
		String actualText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expectedText="I am a Javascript alert box!";
		Assert.assertEquals(actualText, expectedText);
		
	}
	@Test
	public void verifyMessage()
	{
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Gayathri Suseelan");
		WebElement showMessageButton=driver.findElement(By.xpath("//button[text()='Show Message']"));
		showMessageButton.click();
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String actualMessage=yourMessage.getText();
		String expectedMessage="Your Message : Gayathri Suseelan";
		Assert.assertEquals(actualMessage, expectedMessage);
		
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	
	

}
