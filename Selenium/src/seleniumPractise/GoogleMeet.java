package seleniumPractise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMeet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		Thread.sleep(1000);
		d.navigate().to("file:///C:/Users/Maheshwar%20Pandey/Desktop/alert.html");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[.=' Try it ']")).click();

		Thread.sleep(2000);
		Alert al=d.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	

		d.close();
	}

}
