package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Box extends No1_Base{
	
	public void box() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbx= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		if(!checkbx.isSelected()) {
			checkbx.click();
		}
	}
	
	/*public void multipleBox() {
		List<WebElement> multy = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement multybox:multy) {
			if(!multybox.isSelected()) {
				multybox.click();
			}
		
	// uncheck one selected checkbox
		WebElement unselectsecondBoxOnly= driver.findElement(By.xpath("//input[@id='check-box-two']"));
		unselectsecondBoxOnly.click();
			
		}
	}*/
	
	//check specific checkboxes
	public void selectSecondAndThirdBoxes() {
		List<WebElement> multyboxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
			if( !multyboxes.get(1).isSelected()) {
				multyboxes.get(1).click();
			}
			
			if( !multyboxes.get(2).isSelected()) {
				multyboxes.get(2).click();
			}
		}
	

	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButtonFemale = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		radioButtonFemale.click();
		
		//for checking one only check box is able to select
		WebElement radiobuttonmale = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radiobuttonmale.click();
	}
	
	public static void main(String[] args) {
		
     Box b = new Box();
     b.base();
     b.box();
     b.selectSecondAndThirdBoxes();
     b.radioButton();
	}

}
