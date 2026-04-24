package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputFormPage extends Base{

	public static void main(String[] args) {
		InputFormPage entermssge = new InputFormPage();
		entermssge.browserInitialization();
		entermssge.enterMassage();
		entermssge.enterAandB();
		entermssge.checkingThreeEnterFlds();
		

	}
	
	public void enterMassage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement message = driver.findElement(By.id("single-input-field"));
		// isEnabled
		System.out.println(message.isEnabled());
		message.sendKeys("test");
		
		WebElement showMessageButton = driver.findElement(By.id("button-one"));
		showMessageButton.click();
	}
	
	    public void enterAandB() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement enterA = driver.findElement(By.id("value-a"));
		enterA.sendKeys("10");

		WebElement enterB = driver.findElement(By.id("value-b"));
		enterB.sendKeys("20");
		
		WebElement enterButton = driver.findElement(By.id("button-two"));
		enterButton.click();
	}
	    
	    public void checkingThreeEnterFlds() {
	    	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	    	List<WebElement> checking = driver.findElements(By.xpath("//input[@type='text']"));
			for(WebElement multienter: checking) {
				multienter.sendKeys("hi");
	    }
	    }

}
