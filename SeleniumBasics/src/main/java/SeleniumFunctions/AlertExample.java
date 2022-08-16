package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement clickJSAlert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		WebElement clickJSConfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		WebElement clickJSPrompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		clickJSAlert.click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().accept();
		clickJSConfirm.click();
		driver.switchTo().alert().dismiss();
		clickJSPrompt.click();
		driver.switchTo().alert().sendKeys("succesfully closed");
		driver.switchTo().alert().accept();
	}

}
