package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		WebElement Checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
		Checkbox2.click();
		boolean deselect=Checkbox2.isSelected();
				if(deselect==false)
		{
			System.out.println("Deselected verification is passed.Return"+" "+deselect);
		}
		else
		{
			System.out.println("Deselected verification is failed.Return"+" "+deselect);
		}
	}

}
