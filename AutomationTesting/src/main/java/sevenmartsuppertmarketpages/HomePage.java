package sevenmartsuppertmarketpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class HomePage {
	public WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement profileDropDown;

	@FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
	WebElement logout;

	// assertion loginpage
	@FindBy(xpath = "//li[@class='breadcrumb-item active']")
	WebElement dashboardText;

	// chaining adminusermoreinfo
	@FindBy(xpath = "(//a[@class='small-box-footer'])[1]")
	WebElement adminUserMoreInfo;

	// managecatageory elements(manageCategory and moreInfo)
	@FindBy(xpath = "(//div[@class='col-lg-3 col-6'])[9]")
	WebElement manageCategory;

	@FindBy(xpath = "(//a[contains(@class,'small-box-footer')])[9]")
	WebElement moreInfo;
// chaning ManageContact
	@FindBy(xpath = "(//a[@class='small-box-footer'])[3]")
	WebElement clickOnMoreInfoOfManageContact;

	//assertion homepageTest
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signButton;
	
	// assertion method - loginpage
	public boolean isDashboardDisplayed() {
		return dashboardText.isDisplayed();
	}

//chaining method-adminuser
	public AdminUserPage clickAdminUserMoreInfo() {
		wait.waitElementToBeClickable(driver, adminUserMoreInfo);
		adminUserMoreInfo.click();
		return new AdminUserPage(driver);
	}

	public HomePage clickOnProfileDropDown() {
		profileDropDown.click();
		return this;
	}

	public HomePage clickOnlogOut() {
		logout.click();
		return this;
	}

	public ManageCategoryPage clickOnmanageCategory() {
		manageCategory.click();
		return new ManageCategoryPage(driver);
	}

	public ManageCategoryPage clickOnmoreInfoOfManageCategory() {
		moreInfo.click();
		return new ManageCategoryPage(driver);

	}

	public ManageContactPage clickMoreInfoOfManageContact() {
		clickOnMoreInfoOfManageContact.click();
		return new ManageContactPage(driver);
	}
	
	// assertion method
		public boolean assertionSigninButtionIsDisplayedAfterLogout() {
			signButton.click();
			return signButton.isDisplayed();
		}

}
