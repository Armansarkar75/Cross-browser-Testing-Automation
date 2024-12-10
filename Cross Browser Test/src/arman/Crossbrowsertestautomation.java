package arman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsertestautomation {

	public static void main(String[] args) {
		//String BrowserName = "Chrome";
		//String BrowserName = "Firefox";
	    String BrowserName = "Edge";
		
		WebDriver driver = null;
		
		if(BrowserName.equalsIgnoreCase("Chrome")) 
		{
			 driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) 
		{
			 driver = new FirefoxDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Edge")) 
		{
			 driver = new EdgeDriver();
		}
		else
		{
			System.out.println("valid browser");
		}
		
		driver.manage().window().maximize();
		driver.get("https://consortium-analytics.web.app/");
		
		

	}
		

}
