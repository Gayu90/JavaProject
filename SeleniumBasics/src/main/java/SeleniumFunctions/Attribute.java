package SeleniumFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
	}

}
//driver.get("https://demo.guru99.com/test/social-icon.html");
//driver.manage().window().maximize();
//WebElement youtube=driver.findElement(By.xpath("//a[@class='you-tube']"));
//String attribute= youtube.getAttribute("title");

//System.out.println(attribute);