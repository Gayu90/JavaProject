package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAndWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement choseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		WebElement uploadButton=driver.findElement(By.xpath("//input[@id='file-submit']"));
		choseFile.sendKeys("C:\\Users\\User\\Desktop\\resume.doc");
		uploadButton.click();
		//File file=new File("C:\\Users\\User\\Desktop\\resume.doc");
        //chooseFile.sendKeys(file.getAbsolutePath());
        //uploadButton.click();

	}

}
