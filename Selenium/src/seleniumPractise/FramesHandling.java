package seleniumPractise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","C:\\work\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://the-internet.herokuapp.com/iframe");
		//to change the frame
//		driver.switchTo().frame(0);
//		WebElement txt = driver.findElement(By.id("tinymce"));
//		txt.clear();
//		txt.sendKeys("Maheshwar Pandey");
		
		
		/* 
		 * checking the findElements method
		 */
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int total = 0;
		for(WebElement wb: ele)
		{
			System.out.println(wb.getText()+""+wb.getAttribute("href"));
			total++;
		}
		System.out.println("Total Links : "+ele.size());
		
		
		
		
		driver.close();

	}

}
