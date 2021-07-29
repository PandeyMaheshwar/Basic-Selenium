package seleniumPractise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		Robot r = new Robot();
		
		//keyPress (to open a new tab)
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		//keyRelease
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(2000);
		
	    // for opening a new window
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_N);
		
		Thread.sleep(1000);
		
		//move the cursor
		r.mouseMove(400,300);
		Thread.sleep(1000);
		
		r.mouseMove(500,800);
		Thread.sleep(1000);
		
		r.mouseMove(900,300);
		Thread.sleep(1000);
		
		

		
		

	}

}
