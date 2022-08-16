
package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraBootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/jquery-dual-list.php");
		driver.manage().window().maximize();
		WebElement Removeall=driver.findElement(By.xpath("//button[contains(text(),'Remove All')]"));
		Removeall.click();
		WebElement java=driver.findElement(By.xpath("//option[text()='Java']"));
		java.click();
		WebElement Add1=driver.findElement(By.xpath("//button[text()='Add']"));
		Add1.click();
		WebElement Flutter=driver.findElement(By.xpath("//option[text()='Flutter']"));
		Flutter.click();
		WebElement Add2=driver.findElement(By.xpath("//button[text()='Add']"));
		Add2.click();
		WebElement Swift=driver.findElement(By.xpath("//option[text()='Swift']"));
		Swift.click();
		WebElement Add3=driver.findElement(By.xpath("//button[text()='Add']"));
		Add3.click();
		
		
	}

}
