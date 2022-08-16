package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickersPage {
 WebDriver driver;
	
	@FindBy(xpath = "//a[@href='date-picker.php']")
	WebElement datePickers;
	@FindBy(xpath = "//input[@class='form-control datepicker']")
	WebElement enterDateField;
	@FindBy(xpath = "//th[@class='next']")
	WebElement nextButton;
	@FindBy(xpath = "//th[@class='prev']")
	WebElement prevButton;
	
	
	public DatePickersPage(WebDriver driver) {
		
		this.driver=driver;
		
	PageFactory.initElements(driver, this);	
		
	}
public void clickOnDatePickers() {
	
	datePickers.click();
	
	
		
}
	
public void clickOnEnterDateField() {
	
	enterDateField.click();
	
}
public void selectDate(String date) { 

	String split[]=date.split("-");
	String year=split[2];
	String dateactual=split[0];
	int m=Integer.parseInt(split[1]);
	String month ="";
	switch(m) {
	case 1:month="january";
	break;
	case 2:month="February";
	break;
	case 3:month="March";
	break;
	case 4:month="April";
	break;
	case 5:month="May";
	break;
	case 6:month="June";
	break;
	case 7:month="July";
	break;
	case 8:month="August";
	break;
	case 9:month="September";
	break;
	case 10:month="October";
	break;
	case 11:month="November";
	break;
	case 12:month="November";
	break;
		default:
		break;
	}
	
	System.out.println(dateactual+" "+month+" "+year );
}
}


