 package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionExample {

	public WebDriver driver;
	
	public void javascriptExample() {
		driver = new ChromeDriver ();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor script = (JavascriptExecutor) driver;
		//scrolup
		script.executeScript("window.scrollBy(0,4500)");
		//scrolldown
		script.executeScript("window.scrollBy(0,-1000)");
		WebElement amazon = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		script.executeScript("arguments[0].click();",amazon);
		amazon.click();
	}
	public static void main(String[] args) {
		
		JavaScriptExecutionExample javascriptExecutor = new JavaScriptExecutionExample();
			javascriptExecutor.javascriptExample();
	}

}
