package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Travels {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.xpath("//input[@id='inputFirstName']"));
		firstName.sendKeys("Gayathri");
		WebElement lastName=driver.findElement(By.xpath("//input[@id='inputLastName']"));
		lastName.sendKeys("Vishak");
		WebElement email=driver.findElement(By.xpath("//input[@id='inputEmail']"));
		email.sendKeys("me2gayu@gmail.com");
		Thread.sleep(2000);
		WebElement companyName=driver.findElement(By.xpath("//input[@id='inputCompanyName']"));
		companyName.sendKeys("Allianz");
		WebElement streetAdd1=driver.findElement(By.xpath("//input[@id='inputAddress1']"));
		streetAdd1.sendKeys("Gayathri Nivas");
		Thread.sleep(2000);
		WebElement streetAdd2=driver.findElement(By.xpath("//input[@id='inputAddress2']"));	
		streetAdd2.sendKeys("Kazhakuttom");
		WebElement city=driver.findElement(By.xpath("//input[@id='inputCity']"));	
		city.sendKeys("Trivandrum");
		WebElement stateInput=driver.findElement(By.xpath("//input[@id='stateinput']"));
		stateInput.sendKeys("Kerala");
		WebElement postcode=driver.findElement(By.xpath("//input[@id='inputPostcode']"));
		postcode.sendKeys("695582");
		Thread.sleep(2000);
		WebElement country=driver.findElement(By.xpath("//select[@id='inputCountry']"));
		Select select=new Select(country);
		select.selectByVisibleText("Congo");
		Thread.sleep(2000);
		select.selectByVisibleText("United Kingdom");
			driver.close();
		
		
		
		
		
		
		
	}

}
