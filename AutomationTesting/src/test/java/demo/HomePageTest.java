package demo;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base{

	 @Test 
	  public void verifyValidCredentials() {
		 
		  LoginPage login = new LoginPage(driver);
		  login.enterUserNameAndPassword("carol", "1q2w3e4r");
		  login.clickOnLoginButton();
	  
	 	   HomePage home = new HomePage(driver); 
	 	   home.logoutFromProfile(); 
	 	    
	 	    
	 	  
	 	  
	  } 
	    
	 
}
