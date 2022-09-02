package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Supermarket {
	WebDriver driver;

	@BeforeMethod

	public void beforemethod()
	
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
	}

}
