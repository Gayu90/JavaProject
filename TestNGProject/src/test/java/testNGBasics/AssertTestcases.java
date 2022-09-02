package testNGBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertTestcases {
	WebDriver driver;
	@BeforeMethod
	public void beforemethod()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	@Test
	public void verifyAmazonBgSearchButton()
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		String expectedColor="rgba(0, 0, 0, 0)";
		String actualColor=searchButton.getCssValue("background-color");
		Assert.assertEquals(actualColor, expectedColor);
	}
	@Test
	public void verifyLikeTooltipObsqura()
	{
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement likeButton=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		String actualtooltip=likeButton.getAttribute("title");
		String expectedToolTip="Follow @obsqurazone on Facebook";
		Assert.assertEquals(actualtooltip, expectedToolTip);
		
	}
	@Test
	public void verifyCheckbox1IsSelected()
	{
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement Checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        Checkbox1.click();
        boolean select= Checkbox1.isSelected();
        Assert.assertTrue(select, "checkbox1 is not selected");
	}
	@Test
	public void verifyCheckbox2IsSelected()
	{
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		boolean select=Checkbox2.isSelected();
		Assert.assertTrue(select, "checkbox2 is not selected");
		
	}
	@Test
	public void verifyDeselectCheckBox2()
	{
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		Checkbox2.click();
		boolean deselect=Checkbox2.isSelected();
		Assert.assertFalse(deselect, "Checkbox2 is  selected");
	}
	@Test
	public void verifyDisabledTravels()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@name='first_name']"));
		firstName.sendKeys("Gayathri");
		WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));
		lastName.sendKeys("Vishak");
		WebElement businessName=driver.findElement(By.xpath("//input[@name='business_name']"));
		businessName.sendKeys("Gayathri90");
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("gayathri@gmail.com");
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
		boolean disabled=submit.isEnabled();
		Assert.assertFalse(disabled, "Submit button is enabled");
	}
	@Test
	public void verifyImageDisplayed()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement getuser=driver.findElement(By.xpath("//button[@id='save']"));
		getuser.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']//img")));
		WebElement image=driver.findElement(By.xpath("//div[@class='card text-center']//img"));
        boolean imageStatus=image.isDisplayed();
        Assert.assertTrue(imageStatus, "Image is not displayed");
	}
	@Test
	public void verifygetTextRadioButtonmale()
	{
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleButton=driver.findElement(By.id("inlineRadio1"));
		maleButton.click();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		String expectedMessage="Radio button 'Male' is checked";
		WebElement message=driver.findElement(By.id("message-one"));
		String actualMessage=message.getText();
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	@Test
	public void verifygettextradiofemaleButton()
	{
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement femaleButton=driver.findElement(By.id("inlineRadio2"));
		femaleButton.click();
		WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
		showSelectedValue.click();
		String ExpectedMessage="Radio button 'Female' is checked";
		WebElement Message=driver.findElement(By.id("message-one"));
		String actualMessage=Message.getText();
		Assert.assertEquals(actualMessage, ExpectedMessage);
	}
	@Test
	public void verifyGettextofGetResults()
	{
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement ageGroup=driver.findElement(By.xpath("//input[@id='inlineRadio22']"));
		ageGroup.click();
		WebElement getResults=driver.findElement(By.xpath("//button[@id='button-two']"));
		 getResults.click();
		 String expectedResult="Gender :\n" + 
		 		"Age group: 1 to 18";
		 WebElement getResult=driver.findElement(By.id("message-two"));
		 String actualResult=getResult.getText();
		 Assert.assertEquals(actualResult, expectedResult);
	}
	@Test
	public void verifyoption1Buttonselected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
		boolean select=option1.isSelected();
		Assert.assertTrue(select);
	}
	@Test
	public void verifyoption2Buttonselected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		option2.click();
		boolean select=option2.isSelected();
		Assert.assertTrue(select);
	}
	@Test
	public void verifyoption3Buttonselected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		option3.click();
		boolean select=option3.isSelected();
		Assert.assertTrue(select);
	}
	@Test
	public void verifyCheckBox1IsSelected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement Checkbox1=driver.findElement(By.id("vfb-6-0"));
	    Checkbox1.click();
	    boolean select=Checkbox1.isSelected();
	    Assert.assertTrue(select);
	       
		
	}
	@Test
	public void verifyCheckBox2IsSelected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement Checkbox2=driver.findElement(By.id("vfb-6-1"));
	    Checkbox2.click();
	    boolean select=Checkbox2.isSelected();
	    Assert.assertTrue(select);
	    
		
	}
	@Test
	public void verifyCheckBox3IsSelected()
	{
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement Checkbox3=driver.findElement(By.id("vfb-6-2"));
	    Checkbox3.click();
	    boolean select=Checkbox3.isSelected();
	    Assert.assertTrue(select);
	    
		
	}
	@Test
	public void verifyTestDisplayedinPopUp()
	
	{
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
        WebElement userID=driver.findElement(By.xpath("//input[@name='uid']"));
        userID.sendKeys("Meetu");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Dec1");
        WebElement LoginButton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        LoginButton.click();
        String expectedAlertText="User or Password is not valid";
        String actualAlertText=driver.switchTo().alert().getText();
        Assert.assertEquals(actualAlertText, expectedAlertText);
        driver.switchTo().alert().accept();
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
