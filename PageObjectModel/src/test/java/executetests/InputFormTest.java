package executetests;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
  InputFormPage inputformpage;
	@Test
	public void verifyThatInformFormpageIsLoaded()

	{
		inputformpage=new InputFormPage(driver);
		boolean status=inputformpage.verifyInputFormText();
		Assert.assertTrue(status);
	}
	

	}

