package testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import automationTesting.Base;

public class Table extends Base {

	public void tableHandle() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));

		System.out.println(table.getText());

	}

	public void fullRowData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRowData = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(tableRowData.getText());
	}

	public void fullColumData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> fullTableColumdata = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement particularColumdatas:fullTableColumdata) {
			System.out.println(particularColumdatas.getText());
		}
	}

	public void readParticularData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement partdata = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[2]"));
		System.out.println(partdata.getText());
	}
	
	public void oneDta() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		String dta ="Edinburgh";
		List<WebElement> tab = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement tabs:tab) {
			if(tabs.getText().equals(dta)) {
				System.out.println(tabs.getText());
			}
		}
	}
	
	

	public static void main(String[] args) {
		Table table = new Table();
		table.browserInitialization();
		table.tableHandle();
		System.out.println("*********************");
		System.out.println("*********************");
		table.fullRowData();
		System.out.println("*********************");
		System.out.println("*********************");
		table.fullColumData();
		System.out.println("*********************");
		System.out.println("*********************");
		table.readParticularData();
		System.out.println("*********************");
		System.out.println("*********************");
		table.oneDta();

	}

}
