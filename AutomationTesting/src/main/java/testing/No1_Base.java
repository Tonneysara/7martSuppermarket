package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class No1_Base {

	public WebDriver driver;
	
	public void base() {
		//navgation methods
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/index.php");
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		// getCurrentURl()
		//String url= driver.getCurrentUrl();
		//System.out.println("the url of the webpage is "+url);
		
		//String pagesoure=driver.getPageSource();
		//System.out.println(pagesoure);
		
		//String title=driver.getTitle();
		//System.out.println(title);
		
		//window managment method
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		
		//navigation interface method
		//driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		//wait managmnt
		
		
		// browser control method
				//driver.close();
				//driver.quit();
	}
	public static void main(String[] args) {
		No1_Base base = new No1_Base();
		base.base();
		

	}

}
