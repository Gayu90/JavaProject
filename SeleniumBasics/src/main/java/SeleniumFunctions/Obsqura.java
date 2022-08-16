package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		String current_url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("current_url"+current_url);
		System.out.println("title"+title);
		String expectedTitle=("Obsqura Testing");
		 String actual=driver.getTitle();
		 if (expectedTitle.equals(actual))
		 {
			 System.out.println("testcase1 passed");
		 }
		 else
		 {
			 System.out.println("testcase1 failed");
		 }
		 String expectedUrl=("https://selenium.obsqurazone.com/index.php");
		 String actualUrl=driver.getCurrentUrl();
		 
		 if (expectedUrl.equals(actualUrl))
		 {
			 System.out.println("testcase2 passed");
		 }
		 else
		 {
			 System.out.println("testcase2 failed");
		 }
		 
        WebElement inputForm=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
        inputForm.click();
        WebElement EnterMessage=driver.findElement(By.id("single-input-field"));
        boolean EnterMessageField=EnterMessage.isDisplayed();
        System.out.println(EnterMessageField);
        WebElement ShowMessage=driver.findElement(By.id("button-one"));
        boolean ShowMessField=ShowMessage.isDisplayed();
        System.out.println(ShowMessField);
        WebElement EnterValueA=driver.findElement(By.id("value-a"));
        boolean EnterValueAField=EnterValueA.isDisplayed();
        System.out.println(EnterValueAField);
        WebElement EnterValueB=driver.findElement(By.id("value-b"));
        boolean EnterValueBField=EnterValueB.isDisplayed();
        System.out.println(EnterValueBField);
        WebElement logo=driver.findElement(By.xpath("//img[@src='images/logo.png']"));
        boolean Logostatus=logo.isDisplayed();
        System.out.println(Logostatus);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
