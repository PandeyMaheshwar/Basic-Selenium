package seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimension {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.manage().window().maximize();
		
		// 1-way to get location and x-y axis
		Point loc5 = d.findElement(By.name("username")).getLocation();
		 int z = d.findElement(By.name("username")).getLocation().getX();
		 int w = d.findElement(By.name("username")).getLocation().getY();
		 System.out.println("Username location"+loc5);
		 System.out.println(z);
		 System.out.println(w);
			
		Point loc2 = d.findElement(By.name("pwd")).getLocation();
		// (also can use) int loca = d.findElement(By.name("pwd")).getLocation().getX();
		int loca = loc2.getX();
		int locb = loc2.getY();
		System.out.println("Password :"+loc2);
		System.out.println("x :"+loca);
		System.out.println("y :"+locb);
		
		Point loc3 = d.findElement(By.id("loginButton")).getLocation();
		int locc = loc3.getX();
		int locd = loc3.getY();
		System.out.println("Login Button :"+loc3);
		System.out.println("x :"+locc);
		System.out.println("y :"+locd);
		
		// 1-way to get the height and width of the element
		
		 int u = d.findElement(By.name("username")).getSize().getHeight();
		 int u1 = d.findElement(By.name("username")).getSize().getWidth();
		 int g = d.findElement(By.name("pwd")).getSize().getHeight();
		 int g1 = d.findElement(By.name("pwd")).getSize().getWidth();
		 int l = d.findElement(By.id("loginButton")).getSize().getHeight();
		 int l1 = d.findElement(By.id("loginButton")).getSize().getWidth();
		 
		 System.out.println("\nUname \nheight :"+u +"\nwidth :"+u1);
		 System.out.println("\nPwd \nheight :"+g +"\nwidth :"+g1);
		 System.out.println("\nLogin \nheight :"+l +"\nwidth :"+l1);
		
		 // 2nd way to get the location x-y axis
		 
		 WebElement ac = d.findElement(By.name("username"));
			Point loc1 = ac.getLocation();
			int locx = loc1.getX();
			int locy = loc1.getY();
			System.out.println("2nd way to get the coordinate: :"+loc1);
			System.out.println("x :"+locx);
			System.out.println("y :"+locy);
			

		Thread.sleep(1000);
		

	}

}
