package automationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocator() {
		WebElement messageFeild = driver.findElement(By.id("single-input-field"));
		WebElement enterA = driver.findElement(By.id("value-a"));
	}

	public void nameLocator() {
		WebElement name = driver.findElement(By.name("description"));
	}
	
	public void classLocator() {
		WebElement enterValue = driver.findElement(By.className("form-control"));
	}
	
	public void linkTextAndPartialLinkText() {
		WebElement simpleFormDemo = driver.findElement(By.linkText("Simple Form Demo")); //linktext
		WebElement partialLinkText = driver.findElement(By.partialLinkText("Simple Form"));
	}
	
	public void cssSectionCombination() {
		//tag#Id
		WebElement tagId =driver.findElement(By.cssSelector("input#single-input-field"));
		//tag.classname
		WebElement tagAndClass = driver.findElement(By.cssSelector("input.form-control"));
		// tag and attribute--> tag[attributetype=value]
		WebElement tagandatribute = driver.findElement(By.cssSelector("input[placeholder=Message]"));
		// tag, class and attribute-->tag.classname[attributetype=value]
		WebElement tagclassandAttribute = driver.findElement(By.cssSelector("input.form-control[placeholder=Message]"));
	}


	//xpath
	/*
	 * two type
	 * 1) relative xpath -//tagname[@attributetype='value']
	 *                    //- current node
	 *                    @attribute -eg @id
	 * 2) absolute xpath -/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input -->(copy full xpath)
	 */
	
	public void absoluteXpath() {
		WebElement absoluteXpath =driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
		WebElement relativeXpath = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	}
	
	//types of relative xpath
	/*1) dynamic Xpath
	 *   a) contains()  -->//tagname[contains(@attributetype,'value')]
	 *   b) text()      -->//tagname[text()='value']
	 *   c) starts-with() -->//tagname[starts-with(@attributetype,'value')]
	 *   d) or & And     --> //tagname[@attributetype='value'or @attributetype='value']
	 * 
	 */
	
	public void dynamicXpath() {
		WebElement contains = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement text = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement startsWith = driver.findElement(By.xpath("//input[starts-with(@id,'single-input')]"));
		WebElement orXpath = driver.findElement(By.xpath("//input[@id='single-input-field' or @placeholder='Message']"));
		WebElement andXpath = driver.findElement(By.xpath("//input[@id='single-input-field' and @placeholder='Message']"));
		
	}
	
	// to find complex or dynamic elements
	public void axesMethod() {
		WebElement axesmethd = driver.findElement(By.xpath("//button[@id='button-one']//parent::form"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
