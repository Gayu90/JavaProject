package SeleniumFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/dynamic-load.php");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement getuser=driver.findElement(By.xpath("//button[@id='save']"));
		getuser.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card text-center']//img")));
		WebElement image=driver.findElement(By.xpath("//div[@class='card text-center']//img"));
        boolean imageStatus=image.isDisplayed();
        System.out.println("Image displayed"+" " +imageStatus);
		WebElement email=driver.findElement(By.xpath("//p[@class='card-text text-center p-3']"));
		System.out.println("email printed:"+" "+email.getText());
	}

}
