package WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getcurent_URL {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.monster.com");
		
		String expurl="https://www.monster.com";
		String acturl=driver.getCurrentUrl();
		if(expurl.equals(acturl)){
			
			System.out.println("Tc is Pass");
}
else {
			
}
}

}
