package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement singleCheckBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		String attribute1=singleCheckBox.getAttribute("class");
		System.out.println("Single Check Box class="+" "+attribute1);
		String attribute2=singleCheckBox.getAttribute("id");
		System.out.println("Single Check Box ID="+" "+attribute2);
		String attribute3=singleCheckBox.getAttribute("type");
		System.out.println("Single Check Box Type="+" "+attribute3);
		WebElement CheckboxOne=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		String attribute4=CheckboxOne.getAttribute("class");
		System.out.println("CheckBoxOne class="+" "+attribute4);
		String attribute5=CheckboxOne.getAttribute("ID");
		System.out.println("CheckBoxOne ID="+" "+attribute5);
		String attribute6=CheckboxOne.getAttribute("Type");
		System.out.println("CheckBoxOne Type="+" "+attribute6);
		WebElement CheckboxTwo=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		String attribute7=CheckboxTwo.getAttribute("class");
		System.out.println("CheckBoxTwo class="+" "+attribute7);
		String attribute8=CheckboxTwo.getAttribute("ID");
		System.out.println("CheckBoxTwo ID="+" "+attribute8);
		String attribute9=CheckboxTwo.getAttribute("Type");
		System.out.println("CheckBoxTwo Type="+" "+attribute9);
		WebElement CheckboxThree=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		String attribute10=CheckboxThree.getAttribute("class");
		System.out.println("CheckBoxThree class="+" "+attribute10);
		String attribute11=CheckboxThree.getAttribute("ID");
		System.out.println("CheckBoxThree ID="+" "+attribute11);
		String attribute12=CheckboxThree.getAttribute("Type");
		System.out.println("CheckBoxThree Type="+" "+attribute12);
		WebElement CheckboxFour=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		String attribute13=CheckboxFour.getAttribute("class");
		System.out.println("CheckBoxFour class="+" "+attribute13);
		String attribute14=CheckboxFour.getAttribute("ID");
		System.out.println("CheckBoxFour ID="+" "+attribute14);
		String attribute15=CheckboxFour.getAttribute("Type");
		System.out.println("CheckBoxFour Type="+" "+attribute15);
		
		
		
		
		
		
	}

}
