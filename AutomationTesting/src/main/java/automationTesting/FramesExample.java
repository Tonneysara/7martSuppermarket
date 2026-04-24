package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public void frames() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//iframe
		WebElement jMeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
	}
	
	
	public static void main(String[] args) {
		FramesExample frameseg = new FramesExample();
		frameseg.frames();
		

	}

}
