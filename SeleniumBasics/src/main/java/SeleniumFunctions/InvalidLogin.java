package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
        WebElement userID=driver.findElement(By.xpath("//input[@name='uid']"));
        userID.sendKeys("Meetu");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Dec1");
        WebElement LoginButton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        LoginButton.click();
        String expectedAlert="User or Password is not valid";
        String alertText=driver.switchTo().alert().getText();
        System.out.println("Popup message"+" "+alertText);
        if(expectedAlert.equals(alertText))
        {
        	System.out.println("Popup verification Test case Passed");
        	
        }
        else
        {
        	System.out.println("Popup verification Test case Failed");
        }
        driver.switchTo().alert().accept();
	}

}
