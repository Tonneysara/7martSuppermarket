package sevenmartsuppertmarketpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constant;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUserPage {

	public WebDriver driver;

	PageUtility pageUtilityObject = new PageUtility();
	WaitUtility wait = new WaitUtility();

	public AdminUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@onclick='click_button(1)']")
	WebElement newButton;

	@FindBy(xpath = "//input[@id='username']")
	WebElement userName;

	// assertion
	@FindBy(xpath = "//div[contains(@class,'alert') and contains(@class,'alert-danger')]")
	WebElement alertMsg;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//select[@name='user_type']")
	WebElement userType;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement saveButton;

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchButton;

	@FindBy(xpath = "//input[@id='un']")
	WebElement usernameFieldSearch;

	@FindBy(xpath = "//select[@id='ut']")
	WebElement userTypeFieldSearch;

	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")
	WebElement clickOnSearchButton;
	
	@FindBy(xpath="(//div[@class='card-header'])[3]")
	WebElement assertionAdminuserTextDisplayed;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-warning']")
	WebElement resetButton;

	public AdminUserPage clickOnNewButton() {
		// wait.waitElementToBeClickable(driver, newButton);
		newButton.click();

		return this;
	}

	public AdminUserPage enterUserNameandPassword(String usernameInAdminPage, String passwordinAdminPage) {
		userName.sendKeys(usernameInAdminPage);
		password.sendKeys(passwordinAdminPage);
		return this;
	}

	public AdminUserPage enterPassword(String passWord) {

		pageUtilityObject.enterText(password, passWord);
		return this;
	}

	public AdminUserPage selectUserType() {

		pageUtilityObject.selectByValue(userType, Constant.USERTYPEADMIN);
		return this;
	}

	public AdminUserPage clickOnSaveButton() {
		// System.out.println("Before Save");
		wait.waitElementToBeClickable(driver, saveButton);
		// pageUtilityObject.javaScript(saveButton);
//System.out.println("After Save");
		saveButton.click();
		return this;
	}

	public AdminUserPage searchUserNameAndUserType() {
		searchButton.click();
		usernameFieldSearch.sendKeys(Constant.SEARCHUSERNAMEADMIN);
		pageUtilityObject.selectByValue(userTypeFieldSearch, Constant.USERTYPEADMIN);
		clickOnSearchButton.click();
		return this;
	}

	//assertion 
	public boolean assertionIsAlertDisplayed() {
		return alertMsg.isDisplayed();
	}
	
	//assertion search
	public boolean assertionIsadminusearchIsDisplayed() {
		return assertionAdminuserTextDisplayed.isDisplayed();
	}
	
	public AdminUserPage resetAdminUser() {
		resetButton.click();
		return this;
	}
	
	public boolean assertionInReset_IsAdminUserTextIsDisplayed() {
		return assertionAdminuserTextDisplayed.isDisplayed();
	}

}
