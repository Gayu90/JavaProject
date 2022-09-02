package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrames {
	WebDriver driver;
	@BeforeMethod

	public void beforemethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test
	public void switchFrameBottom()
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");	
	//driver.switchTo().frame(1);
	driver.switchTo().frame("frame-bottom");
	WebElement frameBottom=driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
	System.out.println(frameBottom.getText());
}
	@Test
	public void switchFrameLeft()
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-left");
	WebElement frameleft=driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
	System.out.println(frameleft.getText());
}
	@Test
	public void switchFrameMiddle()
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-middle");
	WebElement frameMiddle=driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
	System.out.println(frameMiddle.getText());
	}
	@Test
	public void switchFrameRight()
	{
	driver.get("https://the-internet.herokuapp.com/nested_frames");
	driver.switchTo().frame("frame-top");
	driver.switchTo().frame("frame-right");
	WebElement frameRight=driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
	System.out.println(frameRight.getText());
	}
	
	
}


