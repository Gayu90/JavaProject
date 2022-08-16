package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessfulLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
       if(expectedText.equals(actualText))
        {
        	System.out.println("Login Testcase passed");
       }
       else
       {

          System.out.println("Login Testcase failed");
       }
        driver.close();
        
        
        
           
      
             
        
	}

}
