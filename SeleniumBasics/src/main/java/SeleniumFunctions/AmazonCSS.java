package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCSS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));
		String backgroundcolor=searchButton.getCssValue("background-color");
		System.out.println(backgroundcolor);
		String expectedColor="rgba(0, 0, 0, 0)";
		String actualColor=searchButton.getCssValue("background-color");
		if(expectedColor.equals(actualColor))
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase failed");
		}

	}

}
