package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;

	
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public void selectByIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);

	}

	public boolean isElementDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public String getText(WebElement element, String value) {
		return element.getText();
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void actionsDoubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public void actionDragAndDrop(WebElement source, WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
	}

	public void javaScript(WebElement element) {
		JavascriptExecutor script = (JavascriptExecutor) driver;
		script.executeScript("window.scrollBy(0,4500)");
		script.executeScript("window.scrollBy(0,-1000)");

		script.executeScript("arguments[0].click();", element);
		element.click();
		
		
	}

}
