package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
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
		boolean enabled1=submit.isEnabled();
		if(enabled1==false)
		{
			System.out.println(enabled1);
			System.out.println("Disenabled  verification testcase is passed");
		}
		else
		{
			System.out.println("Disenabled verification testcase is failed");
		
		}
		driver.close();






	}

}
