package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends Base {

	// Actions class for mouse actions
	public void dragAndDrop() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action = new Actions(driver);
		//moveToElement is for mousesover
		action.moveToElement(drag).click();
		action.doubleClick(drag).perform();
		
		//box
		//build()-->to implement the sequence of execution
		WebElement drop = driver.findElement(By.id("mydropzone"));
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	
	public static void main(String[] args) {
		
		DragAndDrop dragDrop = new DragAndDrop();
		dragDrop.browserInitialization();
		dragDrop.dragAndDrop();

	}

	
}
