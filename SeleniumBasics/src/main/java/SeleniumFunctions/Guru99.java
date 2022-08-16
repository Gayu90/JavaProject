package SeleniumFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Browser\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		option1.click();
		Thread.sleep(1000);
		boolean select1=option1.isSelected();
		if(select1==false)
		{
			option1.click();
		}

       System.out.println(option1.isSelected()+" "+"Radio Button 1 is selected");
       WebElement option2=driver.findElement(By.id("vfb-7-2"));
		option2.click();
		Thread.sleep(1000);
		boolean select2=option2.isSelected();
		if(select2==false)
		{
			option2.click();
		}

      System.out.println(option2.isSelected()+" "+"Radio Button2 is selected");
      WebElement option3=driver.findElement(By.id("vfb-7-3"));
		option3.click();
		Thread.sleep(1000);
		boolean select3=option3.isSelected();
		if(select3==false)
		{
			option3.click();
		}

     System.out.println(option3.isSelected()+" "+"Radio Button3 is selected");
       WebElement Checkbox1=driver.findElement(By.id("vfb-6-0"));
       Checkbox1.click();
        Thread.sleep(1000);
        WebElement Checkbox2=driver.findElement(By.id("vfb-6-1"));
        Checkbox2.click();
        Thread.sleep(1000);
         WebElement Checkbox3=driver.findElement(By.id("vfb-6-2"));
         Checkbox3.click();
         Thread.sleep(1000);
         boolean selected1=Checkbox1.isSelected();
         boolean selected2=Checkbox2.isSelected();
         boolean selected3=Checkbox3.isSelected();
         
         if(selected1==false)
         {
        	 Checkbox1.click(); 
         }
         if(selected2==false)
         {
        	 Checkbox2.click();
         }
         if(selected3==false)
         {
        	 Checkbox3.click();
         }
         System.out.println(Checkbox1.isSelected()+" "+"CheckBox 1 is selected");
         System.out.println(Checkbox2.isSelected()+" "+"CheckBox 2 is selected");
         System.out.println(Checkbox3.isSelected()+" "+"CheckBox 3 is selected");
	}
}
		
	


