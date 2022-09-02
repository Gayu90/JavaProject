package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchFrame {
	WebDriver driver;
	@BeforeMethod

	public void beforemethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
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
}
