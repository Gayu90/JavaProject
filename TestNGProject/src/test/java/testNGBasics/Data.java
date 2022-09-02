package testNGBasics;

import org.testng.annotations.DataProvider;

public class Data {
	@DataProvider(name="products")
	public Object [][]productdata()
	{
		return new Object [][] {{"mobile"},{"laptop"},{"television"}};
}
	@DataProvider(name="productname")
	public Object [][]productdata1()
	{
		return new Object [][] {{"books"},{"lamp"},{"pen"}};
	}
	@DataProvider(name="credentials")
	public Object [][]logindetails()
	{
		return new Object [][] {{"vidhu","vidhu123$"},{"Gayathri","gayu123%"},{"parvathy","paru123"}};
	}
	@DataProvider(name="textmessage")
	public Object [][]messagedata()
	{
		return new Object [][] {{"Allianz"},{"Infosys"},{"Techversant"},{"Quest"}};

	}
	
}
