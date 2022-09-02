package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CLickAll {
	WebDriver driver;
	  
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void verifyClickedit()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement edit=driver.findElement(By.xpath("//span[text()='Edit']"));
		actions.moveToElement(edit).build().perform();
		actions.click(edit).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void verifyClickCut()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement cut=driver.findElement(By.xpath("//span[text()='Cut']"));
		actions.moveToElement(cut).build().perform();
		actions.click(cut).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void verifyClickCopy()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement copy=driver.findElement(By.xpath("//span[text()='Copy']"));
		actions.moveToElement(copy).build().perform();
		actions.click(copy).build().perform();
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void verifyClickPaste()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement paste=driver.findElement(By.xpath("//span[text()='Paste']"));
		actions.moveToElement(paste).build().perform();
		actions.click(paste).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void verifyClickDelete()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement delete=driver.findElement(By.xpath("//span[text()='Delete']"));
		actions.moveToElement(delete).build().perform();
		actions.click(delete).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void verifyClickQuit()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions actions=new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
		actions.moveToElement(quit).build().perform();
		actions.click(quit).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void verifydoubleclickAlerttext()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions actions=new Actions(driver);
	    actions.doubleClick(doubleclick).build().perform();
	   String text=driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();
	  String expected="You double clicked me.. Thank You..";
	  Assert.assertEquals(text, expected);
	   System.out.println(text);
	}
	//@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
