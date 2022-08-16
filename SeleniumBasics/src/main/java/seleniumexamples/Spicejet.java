package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		WebElement roundtrip=driver.findElement(By.xpath("//div[text()='round trip']"));
		roundtrip.click();
		WebElement deals=driver.findElement(By.xpath("//div[text()='Deals']"));
		deals.click();

	}

}
