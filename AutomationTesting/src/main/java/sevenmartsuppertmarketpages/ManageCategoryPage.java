package sevenmartsuppertmarketpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageCategoryPage {

	public WebDriver driver;
	PageUtility pageUtilityObject = new PageUtility();
	WaitUtility wait = new WaitUtility();

	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newButton;

	@FindBy(xpath = "//input[@class='form-control']")
	WebElement category;

	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement discount;

	@FindBy(xpath = "(//ul[@class='ms-list'])[2]")
	WebElement drop;

	@FindBy(xpath = "//input[@id='main_img']")
	WebElement chooseFile;

	@FindBy(xpath = "//input[@type='radio' and @name='top_menu' and @value='no']")
	WebElement radioButtonShowOnTopMenu;

	@FindBy(xpath = "(//input[@type='radio'])[3]")
	WebElement radioButtionShowOnLeftMenu;

	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement saveButtonManageCategory;

	// assertion
	@FindBy(xpath = "//h1[text()='Add Category']")
	WebElement addCategoryTextAtTheTop;

	public ManageCategoryPage clickOnnewButton() {
		newButton.click();
		return this;
	}

	public ManageCategoryPage sendKeyCategory(String sendKeyCategory) {
		pageUtilityObject.enterText(category, sendKeyCategory);
		return this;
	}

	public ManageCategoryPage slectGroup() {
		wait.waitElementToBeClickable(driver, discount);
		discount.click();
		return this;
	}

	public ManageCategoryPage uploadFile() {
		chooseFile.sendKeys(Constant.FILEUPLOADONMANAGECATEGORY);
		return this;

	}

	public ManageCategoryPage clickOnradioButtonShowOnTopMenu() {
		pageUtilityObject.javaScript(radioButtonShowOnTopMenu);
		radioButtonShowOnTopMenu.click();
		return this;

	}

	public ManageCategoryPage clickOnradioButtionShowOnLeftMenu() {
		radioButtionShowOnLeftMenu.click();
		return this;
	}

	public ManageCategoryPage clickOnsaveButton() {
		pageUtilityObject.javaScript(saveButtonManageCategory);
		wait.waitElementToBeClickable(driver, saveButtonManageCategory);
		saveButtonManageCategory.click();
		return this;
	}

	public boolean addCategorTextIsDispalyed() {
		return addCategoryTextAtTheTop.isDisplayed();
	}
}
