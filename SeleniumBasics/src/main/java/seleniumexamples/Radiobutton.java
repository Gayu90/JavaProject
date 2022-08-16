package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
	    System.out.println("Radio Button 1 is selected");
		Thread.sleep(3000);
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		option2.click();
		Thread.sleep(3000);
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		option3.click();
		Thread.sleep(3000);
		WebElement Checkbox1=driver.findElement(By.id("vfb-6-0"));
		Checkbox1.click();
		Thread.sleep(5000);
		WebElement Checkbox2=driver.findElement(By.id("vfb-6-1"));
		Checkbox2.click();
		Thread.sleep(5000);
		WebElement Checkbox3=driver.findElement(By.id("vfb-6-2"));
		Checkbox3.click();
	}

}
