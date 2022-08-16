package SeleniumFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> allNames=driver.findElements(By.xpath("//table//tbody//tr//td[1]"));
		//for(int i=0;i<allNames.size();i++)
		//{
		//System.out.println(allNames.get(i).getText());
		//}
		for(WebElement t:allNames)
		{
		System.out.println(" "+t.getText());
		}
		
        
}
}
