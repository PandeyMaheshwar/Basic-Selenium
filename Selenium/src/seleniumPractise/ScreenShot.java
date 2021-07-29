package seleniumPractise;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("onePlus mobile");
		d.findElement(By.id("nav-search-submit-button")).click();
		TakesScreenshot ts = (TakesScreenshot) d;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Selenium\\Selenium\\demo1.png");
		Files.copy(src, dest);
		Thread.sleep(2000);
		d.close();
		
		
		
		
	}

}
