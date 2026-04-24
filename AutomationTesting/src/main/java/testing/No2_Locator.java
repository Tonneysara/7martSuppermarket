package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class No2_Locator extends No1_Base {
	
	public void locator() {
		WebElement id = driver.findElement(By.id("single-input-field"));
		WebElement classname = driver.findElement(By.className("btn btn-primary"));
		WebElement name = driver.findElement(By.linkText("Show Message"));
		WebElement partial = driver.findElement(By.partialLinkText("Show"));
		WebElement css = driver.findElement(By.cssSelector("button#button-one"));
		WebElement css1 = driver.findElement(By.cssSelector("input.form-control"));
		WebElement css3 = driver.findElement(By.cssSelector("input[placeholder='Message']"));
		WebElement css4 = driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
		
		//absolute and relative
		WebElement path = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement path1 = driver.findElement(By.xpath("//input[@class='form-control']"));
		WebElement contain = driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement tetx = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement startw = driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement andor = driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Message']"));
		
	}

	public static void main(String[] args) {



	}

}
