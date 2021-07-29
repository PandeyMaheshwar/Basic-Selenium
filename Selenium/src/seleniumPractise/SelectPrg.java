package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPrg {
	static
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/english");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/a")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("birthday_day"));
		Thread.sleep(1000);
		Select sel = new Select(ele);
		WebElement v = sel.getFirstSelectedOption();
		System.out.println(v);
		Thread.sleep(3000);
		driver.close();
	}

}

