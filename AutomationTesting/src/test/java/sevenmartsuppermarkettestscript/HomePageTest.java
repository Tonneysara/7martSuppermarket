package sevenmartsuppermarkettestscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Logout;
import sevenmartsuppertmarketpages.HomePage;
import sevenmartsuppertmarketpages.LoginPage7Mart;
import utilities.ExcelUtility;

public class HomePageTest extends Base {

	@Test
	public void LogOutProfile() throws IOException {

		LoginPage7Mart login = new LoginPage7Mart(driver);
		String username = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String password = ExcelUtility.readStringData(1, 1, "LoginTestData");
		login.userNameAndPassWord(username, password);
		login.clickOnSignButton();

		HomePage home = new HomePage(driver);
		home.clickOnProfileDropDown().clickOnlogOut();

		boolean isSigninButtionDisplayed = home.assertionSigninButtionIsDisplayedAfterLogout();
		Assert.assertTrue(isSigninButtionDisplayed, Constant.SIGNINBUTTONISDISPLAYEDAFTERLOGOUT);
	}
}
