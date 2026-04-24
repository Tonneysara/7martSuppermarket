package automationTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	
		public WebDriver driver;
		public void sendKeyForfileUpload() {
			
			driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/upload");
			driver.manage().window().maximize();
			WebElement files = driver.findElement(By.id("file-upload"));
			files.sendKeys("C:\\Users\\Tonney Sara\\Downloads\\Interface and List.pdf");
			WebElement upload = driver.findElement(By.id("file-submit"));
			upload.click();
	}
		
		public void robotClassForFileUpload() throws AWTException {
			driver = new ChromeDriver();
			driver.get("https://www.ilovepdf.com/word_to_pdf");
			driver.manage().window().maximize();
			WebElement chooseFile = driver.findElement(By.id("pickfiles"));
			chooseFile.click();
			StringSelection selection = new StringSelection("C:\\Users\\Tonney Sara\\Downloads\\Document 7.docx");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		    Robot robot = new Robot();
		    robot.delay(2000);
		    robot.keyPress(KeyEvent.VK_CONTROL);
		    robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		    
		}
		
	public static void main(String[] args) throws AWTException {
		FileUpload file = new FileUpload();
		//file.sendKeyForfileUpload();
		file.robotClassForFileUpload();

	}

}
