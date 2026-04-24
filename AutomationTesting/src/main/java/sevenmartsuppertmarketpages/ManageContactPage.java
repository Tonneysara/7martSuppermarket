package sevenmartsuppertmarketpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageContactPage {

	public WebDriver driver;
	WaitUtility wait;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@href,'edit_contact')]")
	WebElement ActionButton;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//input[@id='email']")
	WebElement emailField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement updateButton;

	// assertion
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement successfullyAlertMsg;

	public ManageContactPage clickOnActionButton() {
		//wait.waitElementToBeClickable(driver, ActionButton);
		ActionButton.click();
		return this;
	}

	public ManageContactPage enterPhoneNumber(String phoneNum) {
		// wait.waitElementToBeVisible(driver, phoneField);
		 phoneField.clear();
		 phoneField.sendKeys(phoneNum);
		return this;
	}

	public ManageContactPage enterMailId(String mailId) {
		emailField.clear();
		emailField.sendKeys(mailId);
		return this;
	}

	public ManageContactPage clickOnUpdateButton() {
		updateButton.click();
		return this;
	}

	public boolean isAlertDisplayed() {
		return successfullyAlertMsg.isDisplayed();
	}

}