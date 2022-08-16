package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	public WebDriver driver;
	By inputFormButton=By.xpath("//a[@href='simple-form-demo.php']");
	public boolean verifyInputFormText()
	{
		
		WebElement inputTab=driver.findElement(inputFormButton);
		inputTab.click();
		inputTab=driver.findElement(inputFormButton);
		return inputTab.isDisplayed();
		
		
	
		
	
	}
	public InputFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	}
	

