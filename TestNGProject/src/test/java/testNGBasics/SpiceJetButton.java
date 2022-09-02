package testNGBasics;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetButton {
	WebDriver driver;

	@BeforeMethod

	public void beforemethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
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
	public void javascriptExecutorExample()
	{
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jsrptexecuter=(JavascriptExecutor) driver;	
		jsrptexecuter.executeScript("window.scrollBy(0,500)");
		jsrptexecuter.executeScript("alert('Gayathri');");
		driver.switchTo().alert().accept();
		//js.executeScript("arguments[0].scrollIntoView();",WebElement);
	}
	@Test
	public void mouseAction()
	{
		driver.get("https://www.amazon.in/");
		WebElement hello=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		 Actions actions=new Actions(driver);
		 actions.moveToElement(hello).build().perform();
		 WebElement signin=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		 //actions.click();
		 
		 actions.click(signin).build().perform();
	}
	
	@Test
	public void mouseAction2() 
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	    WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions actions=new Actions(driver);
	    //actions.contextClick(rightclick).build().perform();
	    actions.doubleClick(doubleclick).build().perform();
	}
	
	@Test
	public void mouseAction3()
	{
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    Actions actions=new Actions(driver);
	    actions.dragAndDrop(source1, destination).build().perform();
	}
	@Test
	public void mouseActions4()
	{
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//search.sendKeys("mobile"+Keys.ENTER);
		search.sendKeys("mobile");
		search.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		//search.sendKeys(Keys.BACK_SPACE);
		search.sendKeys(Keys.ARROW_DOWN);
	}
	@Test
	public void mouseActions5() throws InterruptedException
	{
		Actions actions=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("mobile");


		actions.release(search).build().perform();
		actions.clickAndHold(search).build().perform();
		Thread.sleep(2000);
		actions.release(search).build().perform();
	}
	@Test
	public void robotexample() throws AWTException
	{
		Actions actions=new Actions(driver); 
		driver.get("https://www.amazon.in/");
		//Robot robot=new Robot();
		//WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement hello=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		int x=hello.getLocation().x;
		int y=hello.getLocation().y;
		actions.moveByOffset(1212,14).build().perform();
		//robot.keyPress(KeyEvent.VK_DOWN);
		//robot.mouseMove(x, y);
		System.out.println(x);
	}
}
