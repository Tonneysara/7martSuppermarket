package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox1 extends No1_Base {

	//public void checkbox() {
		//check the checkbox
		//WebElement box = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		
/*		box.click();
		//verify box is selected
		if(box.isSelected()) {
			System.out.println("the check box is selected");
		}
		else {
			System.out.println("the box is not selected");
		}
*/	
		// select the checkbox only if not slected
		
/*		if(!box.isSelected()) {
			box.click();
		}
		
		if(box.isSelected()) {
			box.click();
		}
	}
*/
	public void multlicheckBox() {
		List<WebElement> checkbx = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement checkboxes:checkbx) {
			checkboxes.isSelected();
			System.out.println("the checkboxes is selected");
		}
	}
	
	public static void main(String[] args) {
		
		CheckBox1 box = new CheckBox1();
		box.base();
	//	box.checkbox();
		box.multlicheckBox();

	}

}
