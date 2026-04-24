package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	public WebDriver driver;

	public Logout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath ="//a[@class='dropdown-toggle']")
WebElement ClickOnCarolProfile;

public void clickCarolprofile() {
	ClickOnCarolProfile.click();
}

@FindBy(xpath="//a[@class='logout-btn']")
WebElement clickOnLogoutButton;

public void clickOnLogoutButton() {
	clickOnLogoutButton.click();
}
}

