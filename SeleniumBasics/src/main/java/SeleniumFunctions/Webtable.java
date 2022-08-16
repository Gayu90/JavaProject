package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
		WebElement heading=driver.findElement(By.xpath("//table//thead//tr[1]//th[1]"));
		String headingText=heading.getText();
		System.out.println(headingText);
		WebElement bodytext=driver.findElement(By.xpath("//table//tbody//tr[1]//td[1]"));
		String body=bodytext.getText();
		System.out.println(body);
		
	}

}
