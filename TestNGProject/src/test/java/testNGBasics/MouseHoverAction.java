package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverAction {
	WebDriver driver;
	  
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@Test
	public void verifymouseActionoverImages() throws InterruptedException
	{
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement Image1=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"));
		WebElement Image2=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"));
		WebElement Image3=driver.findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(Image1).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Image2).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(Image3).build().perform();
		
	}
}
