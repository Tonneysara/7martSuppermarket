package automationTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver;
	public void browserInitialization() {
		
		driver = new ChromeDriver();
	    // driver = new EdgeDriver();
		//driver = new FirefoxDriver();
		
		driver.get("https://selenium.qabible.in/index.php");
		
		//maximize
		driver.manage().window().maximize();
	}
	
	//for closing windows
	public void quitAndClose() {
		//driver.close(); //single windows only
		driver.quit();  // will close multiple windows
	}
	
	
	public static void main(String[] args) {
		
		Base base = new Base();
		base.browserInitialization();
		base.quitAndClose();

	}

}
