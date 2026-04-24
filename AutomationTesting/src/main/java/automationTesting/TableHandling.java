package automationTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends Base {

	public static void main(String[] args) {
		TableHandling tablehnding = new TableHandling();
		tablehnding.browserInitialization();
		tablehnding.readfullDataFromTheTable();
		System.out.println("*****");
		tablehnding.particularRow();
		System.out.println("*****");
		tablehnding.readParticularData();
		System.out.println("*****");
		tablehnding.particularColumn();
		System.out.println("*****");
		tablehnding.findData();
	}

	public void readfullDataFromTheTable() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullDataTable = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		// for getting text-->getText()
		System.out.println(fullDataTable.getText());

	}

	public void particularRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowdata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(rowdata.getText());
	}

	public void readParticularData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement particulardata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
		System.out.println(particulardata.getText());
	}

	public void particularColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> particularColumn = driver
				.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for (WebElement columns : particularColumn) {
			System.out.println(columns.getText());
		}
	}

	public void findData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String input = "Edinburgh";
		List<WebElement> partcularData = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for (WebElement data : partcularData) {
			if (data.getText().equals(input)) {
				System.out.println(data.getText());
			}
		}

	}
}