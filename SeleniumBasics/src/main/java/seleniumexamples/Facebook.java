package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//WebElement userName=driver.findElement(By.id("email"));
		//userName.sendKeys("me2gayu@gmail.com");
		//WebElement password=driver.findElement(By.id("pass"));
		//password.sendKeys("gayathri");
		//WebElement Login=driver.findElement(By.name("login"));
		//Login.click();
		//Thread.sleep(5000);
		WebElement forgotPassword=driver.findElement(By.linkText("Forgotten password?"));
		forgotPassword.click();
		
		
	}

}
