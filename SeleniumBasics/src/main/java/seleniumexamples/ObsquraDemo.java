package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement EnterMessage=driver.findElement(By.id("single-input-field"));
		EnterMessage.sendKeys("Marks");
		WebElement ShowMessage=driver.findElement(By.id("button-one"));
		ShowMessage.click();
		Thread.sleep(3000);
		WebElement EnterValueA=driver.findElement(By.id("value-a"));
		EnterValueA.sendKeys("90");
		WebElement EnterValueB=driver.findElement(By.id("value-b"));
		EnterValueB.sendKeys("85");
		WebElement GetTotal=driver.findElement(By.id("button-two"));
		GetTotal.click();
	}

}
