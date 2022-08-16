package executetests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass {
	DatePickersPage datepickerspage;
	@Test
	public void verifyDatePicker() {
		
		datepickerspage=new DatePickersPage(driver);
	
		datepickerspage.clickOnDatePickers();
		datepickerspage.clickOnEnterDateField();
		datepickerspage.selectDate("22-04-2022");
	}
}
