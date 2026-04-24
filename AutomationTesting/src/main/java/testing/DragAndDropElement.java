package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import automationTesting.Base;

public class DragAndDropElement extends Base{

		public void dragAndDrop() {
			driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
			WebElement source = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
			WebElement target = driver.findElement(By.id("mydropzone"));
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).perform();
		}
	public static void main(String[] args) {
	
		DragAndDropElement dragAndDrop = new DragAndDropElement();
		dragAndDrop.browserInitialization();
		dragAndDrop.dragAndDrop();
	}

}
