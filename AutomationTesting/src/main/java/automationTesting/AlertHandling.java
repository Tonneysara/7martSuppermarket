package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{

	public void alertMsg() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertmsg = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		alertmsg.click();
		driver.switchTo().alert().accept();
	}
	
	public void alertMsg2() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertmsg2 = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		alertmsg2.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void alertMsg3() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertmsg3 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alertmsg3.click();
		driver.switchTo().alert().sendKeys("tonney");
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		
		AlertHandling alert = new AlertHandling();
		alert.browserInitialization();
		alert.alertMsg();
		alert.alertMsg2();
		alert.alertMsg3();

	}

}
