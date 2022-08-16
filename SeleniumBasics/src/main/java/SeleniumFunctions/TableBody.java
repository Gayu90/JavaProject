package SeleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableBody {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> allSalary=driver.findElements(By.xpath("//table//tbody//tr//td[6]"));
		System.out.println("Salary of all persons");
		for(WebElement t:allSalary)
		{
				System.out.println(t.getText());
		}
		List<WebElement> allNames=driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		System.out.println("Fontstyle of  all names");
		for(WebElement t:allNames)
		{
			System.out.println(t.getCssValue("font-style"));
			
		}
		System.out.println("Fontcolor of  all names");
		for(WebElement f:allNames)
		{
			System.out.println(f.getCssValue("color"));
			
		}
		List<WebElement> sonyaDetails=driver.findElements(By.xpath("//table//tbody//tr[10]//td"
				+ ""));
		System.out.println("Details of Sonya frost");
		for(WebElement s:sonyaDetails)
		{
			System.out.println(s.getText());
		}
		}
	}


