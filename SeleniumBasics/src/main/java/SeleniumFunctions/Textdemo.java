package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement EnterMessage=driver.findElement(By.id("single-input-field"));
		EnterMessage.sendKeys("Marks");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		showmessage.click();
		String expectedMessage="Your Message : Marks";
		WebElement yourMessage=driver.findElement(By.xpath("//div[@id='message-one']"));
		String expectedMessage1=yourMessage.getText();
		 System.out.println(expectedMessage1);
		 String array[]=expectedMessage1.split(":");
		    System.out.println(array[0]);
		    System.out.println(array[1]);
		    WebElement entervalueA=driver.findElement(By.id("value-a"));
		    entervalueA.sendKeys("4");

		    WebElement entervalueB=driver.findElement(By.id("value-b"));
		    entervalueB.sendKeys("5");

		    WebElement total=driver.findElement(By.id("button-two"));
		    total.click();

		   
		    EnterMessage.getSize();
		    EnterMessage.getLocation();
		    EnterMessage.getTagName();
		    System.out.println("message.getSize():"+EnterMessage.getSize());
		    System.out.println("message.getLocation():"+EnterMessage.getLocation());
		    System.out.println("message.getTagName():"+EnterMessage.getTagName());

	}

}
