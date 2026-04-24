package sevenmartsuppermarkettestscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.LoginPage;
import sevenmartsuppertmarketpages.AdminUserPage;
import sevenmartsuppertmarketpages.HomePage;
import sevenmartsuppertmarketpages.LoginPage7Mart;
import utilities.ExcelUtility;

public class Login7martTest extends Base {
	HomePage home;

	@Test(groups = "smoke")

	public void validUserNameAndValidPassWord() throws IOException {

		LoginPage7Mart login = new LoginPage7Mart(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String passWord = ExcelUtility.readStringData(1, 1, "LoginTestData");

		home = login.userNameAndPassWord(userName, passWord).clickOnSignButton();

		boolean isDashBoardDisplayed = home.isDashboardDisplayed();
		Assert.assertTrue(isDashBoardDisplayed, Constant.ISDASHBOARDISDISPLAYED_LOGINPAGE);
	}

	@Test(groups = "smoke")
	@Parameters({ "username", "password" })
	public void verifyIncorrectUserNameAndCorrectPassword(String username, String password) {

		LoginPage login = new LoginPage(driver);
		login.enterUserNameAndPassword(username, password);
		login.clickOnLoginButton();
	}

	@Test(dataProvider = "usernameAndpassword")
	public void dataProviderUserNameAndPassword(String username, String password) {
		LoginPage7Mart loginPage = new LoginPage7Mart(driver);
		loginPage.userNameAndPassWord(username, password);
		loginPage.clickOnSignButton();
	}

	@DataProvider(name = "usernameAndpassword")
	public Object data() {
		Object datas[][] = { { "admin", "admin" }, { "Admin", "admin" }, { "admin", "Admin12" },
				{ "admin@", "adminpassword" } };
		return datas;
	}
}
