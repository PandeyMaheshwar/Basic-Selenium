package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	static
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.get("https://jsbin.com/osebed/2");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//Select sel = new Select(driver.findElement(By.name("country")));
		
		Select sel = new Select(driver.findElement(By.id("fruits")));
		Thread.sleep(1000);
		if(sel.isMultiple())
			System.out.println("yes");
		else
			{
			System.out.println("false");
		
			}
		
		sel.selectByVisibleText("Grape");
		driver.close();
	}
}
