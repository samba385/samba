package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class maximize {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
		//maximize the browser window
		driver.manage().window().maximize();
		//minimize the browser window
		driver.manage().window().minimize();
	
	}

}
