package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@id='loginform-username']")
WebElement userName;

@FindBy(xpath="//input[@id='loginform-password']")
WebElement password;

@FindBy(xpath="//button[@name='login-button']")
WebElement loginButton;

public void enterUserNameAndPassword(String userNamefield, String passwordfield) {
	userName.sendKeys(userNamefield);
	password.sendKeys(passwordfield);
	
}

public void clickOnLoginButton() {
	loginButton.click();
}


}
