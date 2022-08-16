package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(" https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement SingleCheckbox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		SingleCheckbox.click();
		WebElement CheckboxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		CheckboxOne.click();
		WebElement CheckboxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		CheckboxTwo.click();
		WebElement CheckboxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		CheckboxThree.click();
		WebElement CheckboxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		CheckboxFour.click();
		
	}

}
