package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_name']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.ID, using = "password") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.ID, using ="login_submit") WebElement SIGNIN_BUTTON_ELEMENT;
	
	public void insertUsername(String Username) {
		USERNAME_ELEMENT.sendKeys(Username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void insertPassword(String Password) {
		PASSWORD_ELEMENT.sendKeys(Password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnSinginButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	
}
