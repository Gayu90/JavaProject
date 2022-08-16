package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleButton=driver.findElement(By.id("inlineRadio1"));
		maleButton.click();
		WebElement showSelectedValue1=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue1.click();
		String expectedMessage="Radio button 'Male' is checked";
		WebElement Message1=driver.findElement(By.id("message-one"));
		String actualMessage1=Message1.getText();
		System.out.println("Expected Message1"+" "+actualMessage1);
		boolean maleButtonStatus=maleButton.isSelected();
		if(maleButtonStatus==false)
		{
			maleButton.click();
		}
		System.out.println(maleButtonStatus+" "+"Male radio button is selected");
		WebElement femaleButton=driver.findElement(By.id("inlineRadio2"));
		femaleButton.click();
		WebElement showSelectedValue2=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue2.click();
		String ExpectedMessage1="Radio button 'Female' is checked";
		WebElement Message2=driver.findElement(By.id("message-one"));
		String expectedMessage2=Message2.getText();
		System.out.println("Expected Message2"+" "+expectedMessage2);
		boolean femaleButtonStatus=femaleButton.isSelected();
		if(femaleButtonStatus==false)
		{
			femaleButton.click();
		}
		System.out.println(femaleButtonStatus+" "+"Female radio button is selected");
		WebElement ageGroup=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageGroup.click();
		WebElement getResults=driver.findElement(By.xpath("//button[@id='button-two']"));
		 getResults.click();
		 String expectedresult="Gender :\n" + 
		 		"Age group: 1 to 18";
		 		
		 WebElement getResult=driver.findElement(By.id("message-two"));
		 String actualText=getResult.getText();
		 System.out.println(actualText);
			 if (expectedresult.equals(actualText))
		 {
			 System.out.println("testcase1 passed");
		 }
		 else
		 {
			 System.out.println("testcase1 failed");
		 }
		 


		 
		 
		
}
}
