package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String current_url;
		String title;
		current_url=driver.getCurrentUrl();
		title=driver.getTitle();
		System.out.println("current_url"+current_url);
		System.out.println("title"+title);
		 driver.get(driver.getCurrentUrl());
         driver.navigate().refresh();
         String expected="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
         String actual=driver.getTitle();
         if (expected.equals(actual))

         {
                         System.out.println("testcase passed");
                        
         }
         else {

         System.out.println("testcase failed");

         }
         WebElement loginButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
         boolean loginButtonStatus= loginButton.isDisplayed();
         System.out.println(loginButtonStatus);
         WebElement closeButton=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
         closeButton.click();
        
         
	}

}
