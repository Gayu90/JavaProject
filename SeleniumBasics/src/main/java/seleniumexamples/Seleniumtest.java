package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
	
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
//WebElement searchField=driver.findElement(By.className("nav-input nav-progressive-attribute"));
WebElement searchField=driver.findElement(By.cssSelector("#twotabsearchtextbox"));
searchField.sendKeys("laptop");
WebElement searchButton=driver.findElement(By.cssSelector(".nav-input.nav-progressive-attribute"));
searchButton.click();
	}

}
