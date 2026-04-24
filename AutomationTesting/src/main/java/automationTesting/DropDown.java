package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base {

	public void dropDownSelection() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropDown);
		// select.selectByVisibleText("Yellow");
		// select.selectByValue("Red");
		select.selectByIndex(1);

	}

	public static void main(String[] args) {
		DropDown dropdown = new DropDown();
		dropdown.browserInitialization();
		dropdown.dropDownSelection();

	}
}
