package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("me2gayu@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("gayathri");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@name='login']"));
		LoginButton.click();
	}

}
