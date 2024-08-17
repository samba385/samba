package WebDriver_Methods;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setposition {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		//create object of point class
		Point p=new Point(300,400);
		//use setposition method
		driver.manage().window().setPosition(p);
	  
	}

}
