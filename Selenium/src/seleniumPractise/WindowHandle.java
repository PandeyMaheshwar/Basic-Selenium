package seleniumPractise;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		//System.out.println(source);
		String url = d.getCurrentUrl();
		System.out.println("the url is :"+url);
		String title = d.getTitle();
		System.out.println(title);
		
	
		String hand = d.getWindowHandle();
		System.out.println(hand);
		Set<String> hands = d.getWindowHandles();
		System.out.println(hands);
		d.get("https://www.facebook.com/");
		Thread.sleep(4000);
		d.navigate().back();
		d.navigate().refresh();
		Thread.sleep(4000);
		d.close();
	}
}
