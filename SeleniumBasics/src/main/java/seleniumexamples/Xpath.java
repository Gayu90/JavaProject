package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField=driver.findElement(By.xpath("//div[@class='nav-search-field ']//input[@class='nav-input nav-progressive-attribute']"));
		searchField.sendKeys("camera");
		WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']//input[@id='nav-search-submit-button']"));
		searchButton.click();
	}

}
