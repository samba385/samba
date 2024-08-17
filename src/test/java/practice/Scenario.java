package practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	  Thread.sleep(4000);
	  Dimension d=new Dimension(100, 200);
	  driver.manage().window().setSize(d);
	  Point p=new Point(300, 400);
	  driver.manage().window().setPosition(p);
	  driver.close();
		
	}

}
