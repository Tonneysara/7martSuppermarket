package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox extends No1_Base{
	
	
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement box = driver.findElement(By.id("gridCheck"));
		System.out.println(box.isSelected());
		box.click();
		System.out.println(box.isSelected());
	}
	
	public void radiobutton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		
	}
	

	public static void main(String[] args) {
		
		CheckBox boxs= new CheckBox();
		boxs.base();
		boxs.checkBox();

	}

}
