package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement Selectall=driver.findElement(By.xpath("//input[@id='button-two']"));
		Selectall.click();
		WebElement CheckboxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		WebElement CheckboxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		WebElement CheckboxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		WebElement CheckboxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		boolean Select1=CheckboxOne.isSelected();
		boolean Select2=CheckboxTwo.isSelected();
		boolean Select3=CheckboxThree.isSelected();
		boolean Select4=CheckboxFour.isSelected();
		if(Select1==false)
		{
			CheckboxOne.click();
		}
		if(Select2==false)
		{
			CheckboxTwo.click();
		}
		if(Select3==false)
		{
			CheckboxThree.click();
		}
		if(Select4==false)
		{
			CheckboxFour.click();
		}
		System.out.println(CheckboxOne.isSelected()+" "+"CheckBoxOne is selected");
		System.out.println(CheckboxTwo.isSelected()+" "+"CheckBoxTwo is selected");
		System.out.println(CheckboxThree.isSelected()+" "+"CheckBoxThree is selected");
		System.out.println(CheckboxFour.isSelected()+" "+"CheckBoxFour is selected");
	}

}











