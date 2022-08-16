package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeFb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		WebElement likeButton=driver.findElement(By.xpath("//a[text()='  Like us On Facebook ']"));
		String attribute1=likeButton.getAttribute("title");
		System.out.println(attribute1);
		String expectedText="Follow @obsqurazone on Facebook";
		String actual=likeButton.getAttribute("title");
		if(expectedText.equals(actual))
		{
			System.out.println("Testcase1 passed");
		}
		else
		{
			System.out.println("Testcase failed");
	}
		WebElement followButton=driver.findElement(By.xpath("//a[text()='Follow All']"));
		String attribute2=followButton.getAttribute("title");
		System.out.println(attribute2);
		String expectedText1="Follow @obsqurazone";
		String actual1=followButton.getAttribute("title");
		if(expectedText1.equals(actual1))
		{
			System.out.println("Testcase2 passed");
		}
		else
		{
			System.out.println("Testcase2 failed");
	}
		
		String fontcolor;
		String backgroundcolor;
		fontcolor=followButton.getCssValue("color");
		backgroundcolor=followButton.getCssValue("background-color");
		System.out.println(fontcolor);
		System.out.println(backgroundcolor);
		System.out.println(followButton.getCssValue("font-style"));
		System.out.println(followButton.getCssValue("font-weight"));
		System.out.println(followButton.getCssValue("text-align"));
		
		

}
}
