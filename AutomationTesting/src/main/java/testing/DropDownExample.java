package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import automationTesting.Base;

public class DropDownExample extends Base {

	public void dropDown() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select = new Select(dropdown);
		// select.selectByContainsVisibleText("Red");
		// select.selectByIndex(2);
		select.selectByValue("Green");
		
		// for check dropdown type

		if (select.isMultiple()) {
			System.out.println("multi selected option dropdown");
		} else {
			System.out.println("single select option dropdown");
		}
	
		/* deselect method
		-----------------------
		1)deSelectByContainsVisibleText()
		2)deselectByIndex()
		3)deselectByValue()
		*/
		
		//select.deSelectByContainsVisibleText("Red");
		//select.deselectByIndex(1);
		//select.deselectByValue("Green");
		//select.deselectAll();
	}
	

	// for getting all options from the dropdown-->use getOptions() method
	public void forGettingAllOptions() {
		WebElement allOptionsInDropDown = driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select selectall = new Select(allOptionsInDropDown);
		List<WebElement> option = selectall.getOptions();

		for (WebElement allOptionsInDropDown1 : option) {
			System.out.println(allOptionsInDropDown1.getText());
		}

	}

	public static void main(String[] args) {
		DropDownExample dropdown = new DropDownExample();
		dropdown.browserInitialization();
		dropdown.dropDown();
		dropdown.forGettingAllOptions();
	}
}
