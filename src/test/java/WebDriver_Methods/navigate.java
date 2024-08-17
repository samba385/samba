package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args)
			throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		//go back
		Thread.sleep(400);
		driver.navigate().back();
		//go forward
		Thread.sleep(4000);
		driver.navigate().forward();
		//go refresh
		driver.navigate().refresh();
		//close all tabs
		driver.quit();
}
}
