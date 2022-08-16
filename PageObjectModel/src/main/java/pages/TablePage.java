package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TablePage {
	 WebDriver driver;
	 @FindBy(xpath = "//a[@href='table-pagination.php']")
	 WebElement table;
}