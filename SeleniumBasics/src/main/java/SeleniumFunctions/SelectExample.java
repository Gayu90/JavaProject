package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement categoriesDropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(categoriesDropDown);
		//select.selectByIndex(16);
		//select.selectByValue("search-alias=mobile-apps");
		select.selectByVisibleText("Books");
		Thread.sleep(2000);
		driver.close();
	}

}
