package WebDriver_Methods;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Setsize {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("htpps://www.flipkart.com");
		//set the position of browser
	Dimension d=new Dimension(100,200);
		//use set size method 
		driver.manage().window().setSize(d);
		
	}

}
