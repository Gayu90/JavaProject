package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement Checkbox=driver.findElement(By.xpath("//h3[text()='Checkboxes']"));
        boolean Checkboxstatus=Checkbox.isDisplayed();
        System.out.println(Checkboxstatus);
        WebElement Checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        Checkbox1.click();
        WebElement Checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        Checkbox2.click();
	}
	}


