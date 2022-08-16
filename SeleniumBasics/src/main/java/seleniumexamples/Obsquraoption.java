package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsquraoption {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		WebElement Option1=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 1']"));
		Option1.click();
		WebElement Option2=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 2']"));
		Option2.click();
		WebElement Option4=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 4']"));
		Option4.click();
		WebElement Option5=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 5']"));
		Option5.click();
		WebElement Option7=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 7']"));
		Option7.click();
		WebElement Option8=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 8']"));
		Option8.click();
		WebElement Option9=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 9']"));
		Option9.click();
		WebElement Option10=driver.findElement(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']//option[text()='Option 10']"));
		Option10.click();
		

}
}