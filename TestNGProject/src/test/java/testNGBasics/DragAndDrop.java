package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {
	WebDriver driver;
	 SoftAssert softassert; 
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void verifyAllDragandDrop()
	{
		SoftAssert softassert = new SoftAssert();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source1=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	    WebElement destination1=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	    
	    WebElement source2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	    WebElement destination2=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	    
	    WebElement source3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	    WebElement destination3=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	    
	    Actions actions=new Actions(driver);
	    actions.dragAndDrop(source1, destination1).build().perform();
	    actions.dragAndDrop(source2, destination2).build().perform();
	    actions.dragAndDrop(source3, destination3).build().perform();
	    WebElement debit=driver.findElement(By.xpath("//div[@id='bal3']//td"));
		String actual=debit.getText();
		String expected="Debit Movement";
		softassert.assertEquals(actual, expected);
		System.out.println(actual);
		
		WebElement credit=driver.findElement(By.xpath("//div[@id='bal3']//tr[1]//td[3]"));
		String actualcredit=credit.getText();
		String expected1="Credit Movement";
		softassert.assertEquals(actualcredit, expected1);
		System.out.println(actualcredit);
		
		
		WebElement amountprinted=driver.findElement(By.xpath("//div[@id='bal3']//tr[1]//td[4]"));
		String actualamount=amountprinted.getText();
		String expectedamount="5000";
		softassert.assertEquals(actualamount, expectedamount);
		System.out.println(actualamount);
		softassert.assertAll();
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	
}
