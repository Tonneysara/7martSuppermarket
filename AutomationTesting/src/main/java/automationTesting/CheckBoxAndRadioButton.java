package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckBoxAndRadioButton extends Base {

	public static void main(String[] args) {
		
		CheckBoxAndRadioButton checkBox = new CheckBoxAndRadioButton();
		checkBox.browserInitialization();
		checkBox.checkBox();
		checkBox.RadioButton();
		checkBox.findElementsExample();

	}

	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox=driver.findElement(By.id("gridCheck"));
		System.out.println(checkBox.isSelected());
		checkBox.click();
		System.out.println(checkBox.isSelected());
	}
	
	public void RadioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton = driver.findElement(By.xpath("//label[@for='inlineRadio2']"));
		radioButton.click();
		
		WebElement showButton = driver.findElement(By.id("button-one"));
		showButton.click();
	}
	
	public void findElementsExample() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multipleCheckBox = driver.findElements(By.className("form-check-label"));
		for(WebElement multiboxes: multipleCheckBox) {
			multiboxes.click();
		}
	}
	
	
}
