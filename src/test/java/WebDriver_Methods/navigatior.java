package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatior {
	WebDriver driver;
	
	public void LunchAUT() throws InterruptedException {
	 driver=new ChromeDriver();
	driver.get("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	}
	public void Navigators() throws InterruptedException
	{
		
		driver.navigate().to("https://amazon.com/");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		Thread.sleep(4000);
	}
	public void close() 
	{
		driver.close();
	
    }
	public static void main(String[] args) throws InterruptedException {
		navigatior obj=new navigatior();
		obj.LunchAUT();
		obj.Navigators();
		obj.close();
}
}
