package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.myntra.com");
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("womensandals");
		d.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='button-base-button emptyCart-base-wishlistButton ']")).click();
		Thread.sleep(2000);
		Point loginloc = d.findElement(By.xpath("//a[@class='wishlistLogin-button']")).getLocation();
		
		
		int hgt = d.findElement(By.xpath("//a[@class='wishlistLogin-button']")).getSize().getHeight();
		int wth = d.findElement(By.xpath("//a[@class='wishlistLogin-button']")).getSize().getWidth();
		System.out.println("location of loginbutton"+loginloc);
		System.out.println("height of the loginbutton"+hgt);
		System.out.println("width of the loginbutton"+wth);
		
		String t = d.findElement(By.xpath("//div[@class='wishlistLogin-heading']")).getText();
		System.out.println(t);
		String t2 = d.findElement(By.xpath("//div[@class='wishlistLogin-info']")).getText();
		System.out.println(t2);
		
		
	}

}
