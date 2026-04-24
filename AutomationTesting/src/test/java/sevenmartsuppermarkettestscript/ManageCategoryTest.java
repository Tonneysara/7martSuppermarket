package sevenmartsuppermarkettestscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constant;
import sevenmartsuppertmarketpages.HomePage;
import sevenmartsuppertmarketpages.LoginPage7Mart;
import sevenmartsuppertmarketpages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	HomePage home;
	ManageCategoryPage manageCategory;
	
	@Test
	public void verifyUserIsAbleToAddFilesOnmanageCategory() throws IOException {

		LoginPage7Mart login = new LoginPage7Mart(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginTestData");
		String passWord = ExcelUtility.readStringData(1, 1, "LoginTestData");
		home = login.userNameAndPassWord(userName, passWord).clickOnSignButton();

		manageCategory = home.clickOnmanageCategory();
		home.clickOnmoreInfoOfManageCategory();

		manageCategory.clickOnnewButton().sendKeyCategory(Constant.VEGITABLES_MANAGECATEGORY).slectGroup().uploadFile()
				.clickOnradioButtonShowOnTopMenu().clickOnradioButtionShowOnLeftMenu().clickOnsaveButton();

}

        
}