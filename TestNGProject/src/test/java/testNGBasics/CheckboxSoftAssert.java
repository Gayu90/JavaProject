package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxSoftAssert {
	WebDriver driver;
	 SoftAssert softassert;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifySelectAllCheckBoxes()
	{
		SoftAssert softassert = new SoftAssert();
		WebElement Selectall=driver.findElement(By.xpath("//input[@id='button-two']"));
		Selectall.click();
		WebElement CheckboxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		boolean Select1=CheckboxOne.isSelected();
		softassert.assertTrue(Select1);
		WebElement CheckboxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		boolean Select2=CheckboxTwo.isSelected();
		softassert.assertTrue(Select2);
		WebElement CheckboxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		boolean Select3=CheckboxThree.isSelected();
		softassert.assertTrue(Select3);
		WebElement CheckboxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean Select4=CheckboxFour.isSelected();
		softassert.assertTrue(Select4);
		System.out.println("Test case executed successfully");
	    softassert.assertAll();
	 
		
	}
}
