package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement option1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		option1.click();
		WebElement option2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		option2.click();
		WebElement option3=driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
		option3.click();
		WebElement Checkbox1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		Checkbox1.click();
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		Checkbox2.click();
		WebElement Checkbox3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		Checkbox3.click();
		driver.navigate().to(" https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickMe=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
	}
	}


