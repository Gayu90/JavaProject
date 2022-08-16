package SeleniumFunctions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));

		WebElement start=driver.findElement(By.xpath("//div[@id='start']/button"));
		//driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		start.click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		wait.until(ExpectedConditions.alertIsPresent());
		//wait.until(ExpectedConditions.elementToBeClickable(locator)
		
		WebElement message=driver.findElement(By.xpath("//div[@id='finish']"));
	  System.out.println(message.getText());

	}

}
