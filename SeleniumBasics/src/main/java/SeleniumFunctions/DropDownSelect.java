package SeleniumFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		WebElement selectcolor1=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select color1=new Select(selectcolor1);
		color1.selectByVisibleText("Yellow");
		WebElement selectcolor2=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		Select color2=new Select(selectcolor2);
		color2.selectByVisibleText("Red");
		WebElement selectButton=driver.findElement(By.xpath("//button[@id='button-first']"));
		selectButton.click();
		WebElement message1=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println("Message1"+" "+message1.getText());
		WebElement message2=driver.findElement(By.xpath("//div[@id='message-two']"));
		System.out.println("Message2"+" "+message2.getText());
		driver.close();
	}

}
