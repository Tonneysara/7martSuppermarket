package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends Base{
  @Test
  public void verifyValidCredentials() {
	 
	  LoginPage login = new LoginPage(driver);
	  login.enterUserNameAndPassword("carol", "1q2w3e4r");
	  login.clickOnLoginButton();
  }
  
  @Test
  public void verifyCorrectUserNameAndIncorrectPassword() {
	 
	  LoginPage login = new LoginPage(driver);
	  login.enterUserNameAndPassword("carol", "12345");
	  login.clickOnLoginButton();
  }
  
  @Test
  @Parameters({"username","password"})
  public void verifyIncorrectUserNameAndCorrectPassword(String username, String password) {
	 
	  LoginPage login = new LoginPage(driver);
	  login.enterUserNameAndPassword(username,password);
	  login.clickOnLoginButton();
  }
  
  @Test(dataProvider = "credentials")
  public void verifyIncorrectUserNameAndIncorrectPassword(String userName, String password) {
	 
	  LoginPage login = new LoginPage(driver);
	  login.enterUserNameAndPassword(userName, password);
	  login.clickOnLoginButton();
  }
  
  @DataProvider(name="credentials")
  public Object testData() {
  Object data [][]= {{"carol","1q2w3e4r"},{"carol", "12345"},{"tonney", "1q2w3e4r"},{"sara","1234"}};
  return data;
  }
}
