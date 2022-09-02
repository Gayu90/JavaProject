package testNGBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindowExample {
	WebDriver driver;
	  
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
	}
	@Test
	public void exampleofSwitchToWindow()
	{
		
		WebElement text=driver.findElement(By.xpath("//div[@class='example']/h3"));
		String openText=text.getText();
		System.out.println(openText);
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		//clickHere.click();
		//clickHere.click();
		Set<String>windows=driver.getWindowHandles();
		windows.size();
		System.out.println(windows.size());
		Iterator<String>iterate=windows.iterator();
		  while(iterate.hasNext()) {
			  String childWindow=iterate.next();
			  if(!parentWindow.equals(childWindow)) {
				 driver.switchTo().window(childWindow);
				  
			  }
			  
			  
		  }
		 WebElement newText=driver.findElement(By.xpath("//h3[text()='New Window']"));
		 System.out.println(newText.getText());
		  
	  }
	@Test
	public void exampleSwitchWindow()
	{
		WebElement text=driver.findElement(By.xpath("//div[@class='example']/h3"));
		String openText=text.getText();
		System.out.println(openText);
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String>windows=driver.getWindowHandles();
		for(String w:windows)
		{
			if(parentWindow.equals(w))
			{
				driver.switchTo().window(w);
			}
			WebElement newText=driver.findElement(By.xpath("//h3[text()='New Window']"));
			 System.out.println(newText.getText());
			
		}
	}
	
}
