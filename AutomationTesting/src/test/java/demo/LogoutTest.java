package demo;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Logout;

public class LogoutTest extends Base {

	@Test
	public void verifyValidCredentials() {

		LoginPage login = new LoginPage(driver);
		login.enterUserNameAndPassword("carol", "1q2w3e4r");
		login.clickOnLoginButton();
	
		Logout logoutProfile = new Logout(driver);
		logoutProfile.clickCarolprofile();
		logoutProfile.clickOnLogoutButton();

	}
}
