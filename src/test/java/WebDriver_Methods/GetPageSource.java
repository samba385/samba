package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
		String page=driver.getPageSource();
		System.out.println(page);
		
		
		driver.close();
	}

}
