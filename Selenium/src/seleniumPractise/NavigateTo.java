package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateTo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium download");
		
		Thread.sleep(3000);
		
		d.findElement(By.name("btnK")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//h3[.='Download Selenium IDE']")).click();
		Thread.sleep(1000);

		  d.findElement(By.xpath("//a[text()='3.141.59']")).click();
	        Thread.sleep(1000);

	        d.findElement(By.id("browsersExpand")).click();
	        Thread.sleep(1000);
	        d.findElement(By.xpath("//a[@href='https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html']")).click();        Thread.sleep(1000);
            d.findElement(By.xpath("//a[@href='https://github.com/mozilla/geckodriver/releases']")).click();
	        Thread.sleep(10000);
	        d.findElement(By.xpath("//span[text()='geckodriver-v0.29.1-win64.zip']")).click();
	}

}
