package testNGBasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchtofb {
	WebDriver driver;
	  
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyText()
	{
		WebElement likeusonfacebook=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String parentwindow=driver.getWindowHandle();
		likeusonfacebook.click();
		Set<String>windows=driver.getWindowHandles();
		for(String w:windows)
		{
			if(parentwindow.equals(w))
			{
				driver.switchTo().window(w);
			}
		}
		WebElement newtext=driver.findElement(By.xpath("//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5 r8blr3vg']"));	
		System.out.println(newtext);
	}
	
}
