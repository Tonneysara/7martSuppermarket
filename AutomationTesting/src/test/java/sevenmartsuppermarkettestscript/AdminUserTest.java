package sevenmartsuppermarkettestscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import sevenmartsuppertmarketpages.AdminUserPage;
import sevenmartsuppertmarketpages.HomePage;
import sevenmartsuppertmarketpages.LoginPage7Mart;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUserTest extends Base {
	HomePage home;
	AdminUserPage adminuser;
	FakerUtility faker = new FakerUtility();

	@Test
	public void verifyUserIsAbleToAddNewAdminUser() throws IOException {

		LoginPage7Mart login = new LoginPage7Mart(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String passWord = ExcelUtility.readStringData(1, 1, "LoginTestData");

		login = login.userNameAndPassWord(userName, passWord);
		home = login.clickOnSignButton();
		adminuser = home.clickAdminUserMoreInfo();

		adminuser.clickOnNewButton().enterUserNameandPassword(faker.getFakeFirstName(), faker.getPassword())
				.selectUserType();
		adminuser.clickOnSaveButton();
		
		boolean isAlertDisplayed = adminuser.assertionIsAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ALERTMSGDISPLAYEDONAMDINUSER);

	}

	@Test
	public void verifyUserIsAbleToSearchAlreadyExistingAdmin() throws IOException {
		LoginPage7Mart login = new LoginPage7Mart(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String passWord = ExcelUtility.readStringData(1, 1, "LoginTestData");

		login = login.userNameAndPassWord(userName, passWord);
		home = login.clickOnSignButton();
		adminuser = home.clickAdminUserMoreInfo();
		adminuser.searchUserNameAndUserType();
		
		boolean isAlertDisplayed = adminuser.assertionIsadminusearchIsDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ADMINUSERSEARCHTEXTISDISPLAYED);
	}
	
	@Test
	public void verifyThatUserIsAbleToResetTheAdminUsers() throws IOException {
		LoginPage7Mart login = new LoginPage7Mart(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String passWord = ExcelUtility.readStringData(1, 1, "LoginTestData");

		login = login.userNameAndPassWord(userName, passWord);
		home = login.clickOnSignButton();
		adminuser = home.clickAdminUserMoreInfo();
		adminuser.resetAdminUser();
		
		boolean isAlertDisplayed = adminuser.assertionInReset_IsAdminUserTextIsDisplayed();
		Assert.assertTrue(isAlertDisplayed, Constant.ASSERTIONINRESET_ADMINUSER);
		
	}
}
//String usernameInAdminPage = ExcelUtility.readStringData(1, 0,
// "AdminPageTest");
// String passwordinAdminPage = ExcelUtility.readStringData(1, 1,
// "AdminPageTest");
