package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
public WebDriver driver;
By obsquaraLogo=By.xpath("//img[@src='images/logo.png']");
public boolean isLogoDisplayed()
{
	WebElement logo=driver.findElement(obsquaraLogo);
	return logo.isDisplayed();
}
public HomePage(WebDriver driver)
{
	this.driver=driver;
}
}
