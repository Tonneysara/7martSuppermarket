package sevenmartsuppertmarketpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.util.Assert;

import utilities.WaitUtility;

public class LoginPage7Mart {

	public WebDriver driver;
	WaitUtility wait = new WaitUtility();

	public LoginPage7Mart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement passWord;

	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signButton;

	public LoginPage7Mart userNameAndPassWord(String userNameField, String passWordField) {
		userName.sendKeys(userNameField);
		passWord.sendKeys(passWordField);
		return this;
	}

	public HomePage clickOnSignButton() {
		System.out.println("Clicked Login Button");
		wait.waitElementToBeClickable(driver, signButton);
		signButton.click();
		return new HomePage(driver);
	}

}

