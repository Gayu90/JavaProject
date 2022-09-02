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

public class AssertTest {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
}
	@Test
	public void verifySelectall()
	{
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement Selectall=driver.findElement(By.xpath("//input[@id='button-two']"));
		Selectall.click();
		WebElement CheckboxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean Select1=CheckboxOne.isSelected();
		Assert.assertTrue(Select1);
		WebElement CheckboxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean Select2=CheckboxTwo.isSelected();
		Assert.assertTrue(Select2);
		WebElement CheckboxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean Select3=CheckboxThree.isSelected();
		Assert.assertTrue(Select3);
		WebElement CheckboxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean Select4=CheckboxFour.isSelected();
		Assert.assertTrue(Select4);
	}
	@Test
	public void verifycurrentUrlObsqura()
	{
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://selenium.obsqurazone.com/index.php";
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Test
	public void verifyTitleObsqura()
	{
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		String expectedTitle=("Obsqura Testing");
		 String actualTitle=driver.getTitle();
		 Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifySuccessfulLogin()
	{
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.name("userName"));
		userName.sendKeys("mercury");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("mercury");
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
		WebElement loginSuccess=driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		String result=loginSuccess.getText();
        System.out.println("Result:"+" "+result);
       String expectedText="Login Successfully";
        String actualText=loginSuccess.getText();
        Assert.assertEquals(actualText, expectedText);
	}
	@AfterMethod
	public void aftermethod()
	{
		driver.close();
	}
	
}

