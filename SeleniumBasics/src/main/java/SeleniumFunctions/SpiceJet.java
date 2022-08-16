package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		String current_url=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("current_url"+current_url);
		System.out.println("title"+title);
		String expected=("https://www.spicejet.com/");
		String actual=driver.getCurrentUrl();
		if (expected.equals(actual))

        {
                        System.out.println("testcase1 passed");
                       
        }
        else {

        System.out.println("testcase1 failed");

        }
		String expected1="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		String actual1=driver.getTitle();
		if (expected1.equals(actual1))

        {
                        System.out.println("testcase2 passed");
                       
        }
        else {

        System.out.println("testcase2 failed");

        }
		WebElement roundTripButton=driver.findElement(By.xpath("//div[text()='round trip']"));
        boolean roundbuttonstatus=roundTripButton.isDisplayed();
        System.out.println(roundbuttonstatus);
        WebElement searchFlight=driver.findElement(By.xpath("//div[text()='Search Flight']"));
        boolean searchFlightButtonStatus=searchFlight.isDisplayed();
        System.out.println(searchFlightButtonStatus);
        WebElement logo=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1loqt21 r-13awgt0 r-1mlwlqe r-1udh08x r-1otgn73 r-1lgpqti']"));
        boolean spicejetlogo=logo.isDisplayed();
        System.out.println(spicejetlogo);
	}

}
