package sevenmartsuppermarkettestscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import sevenmartsuppertmarketpages.HomePage;
import sevenmartsuppertmarketpages.LoginPage7Mart;
import sevenmartsuppertmarketpages.ManageContactPage;
import utilities.ExcelUtility;
import java.io.IOException;

public class ManageContactTest extends Base {
	HomePage home;
	ManageContactPage manageContact;

	@Test
	public void verifyUserIsAbleToContactDetailsSuccessfully() throws IOException {
		LoginPage7Mart login = new LoginPage7Mart(driver);
		String username = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String password = ExcelUtility.readStringData(1, 1, "LoginTestData");
		home = login.userNameAndPassWord(username, password).clickOnSignButton();

		manageContact = home.clickMoreInfoOfManageContact();
		manageContact.clickOnActionButton();

		manageContact.enterPhoneNumber(Constant.PHONENUMBERINMANAGECONTACTPAGE)
				.enterMailId(Constant.EMAILIDINMANAGECONTACTPAGE).clickOnUpdateButton();

		boolean isAlertDisplayed = manageContact.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.MANAGECONTACT_ASSERTION);
	}
}
