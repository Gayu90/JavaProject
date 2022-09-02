package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMove {
	WebDriver driver;
	  
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html ");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyAllLink() throws InterruptedException
	{
		
		WebElement mail=driver.findElement(By.xpath("(//span[@class='assistive-text'])[1]"));
		WebElement google=driver.findElement(By.xpath("(//span[@class='assistive-text'])[2]"));
		WebElement youtube=driver.findElement(By.xpath("(//span[@class='assistive-text'])[3]"));
		WebElement github=driver.findElement(By.xpath("(//span[@class='assistive-text'])[4]"));
		WebElement facebook=driver.findElement(By.xpath("(//span[@class='assistive-text'])[5]"));
		WebElement rss=driver.findElement(By.xpath("(//span[@class='assistive-text'])[6]"));
		Actions actions=new Actions(driver);
		actions.moveToElement(mail).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(google).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(youtube).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(github).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(facebook).build().perform();
		Thread.sleep(2000);
		actions.moveToElement(rss).build().perform();
		
	}
	@Test
	public void verifyProductSearch(String product) 
	{
		
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(product);
		WebElement searchbutton=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		searchbutton.click();
	}
	@Test(dataProvider = "credentials",dataProviderClass =Data.class)
	public void verifyLogin(String username,String passWord)
	{
		driver.get("https://demo.guru99.com/test/login.html");
		WebElement userName=driver.findElement(By.xpath("//input[@id='email']"));
		userName.sendKeys(username);
		WebElement password=driver.findElement(By.xpath("//input[@id='passwd']"));
		password.sendKeys(passWord);
		WebElement loginButton=driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		loginButton.click();
		WebElement message=driver.findElement(By.xpath("//h3[text()='Successfully Logged in...']"));
		String messagetext=message.getText();
		System.out.print(messagetext);
		
	}
	
	
	
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
}
