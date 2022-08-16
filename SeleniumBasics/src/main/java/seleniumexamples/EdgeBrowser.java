package seleniumexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Desktop\\Browser\\Edgedriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
