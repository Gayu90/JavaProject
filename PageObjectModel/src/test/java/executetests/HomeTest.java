package executetests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	HomePage homepage;
	
@Test
public void verifyWhetherTheLogoIsDisplayed()
{
	homepage=new HomePage(driver);
	boolean status=homepage.isLogoDisplayed();
	Assert.assertTrue( status);
}
}
