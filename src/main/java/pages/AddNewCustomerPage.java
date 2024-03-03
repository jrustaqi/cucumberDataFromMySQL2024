package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewCustomerPage extends TestBase{

	WebDriver driver;
	public AddNewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH,using = "//input[@name='name']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='company_name']") WebElement COMPANY_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='email']") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='phone']") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='address']") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='city']") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH,using = "//input[@name='port']") WebElement ZIP_CODE_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='country']") WebElement COUNTRY_NAME_ELEMENT;
	@FindBy(how = How.XPATH,using = "//select[@name='customer_group']") WebElement GROUP_ELEMENT;
	@FindBy(how = How.XPATH,using = "//button[@id='save_btn']") WebElement SAVE_BUTTON_ELEMENT;
	
	String insertedName;
	public void insertFullname(String fullName) {
		int genNum = generateRandomNumber(999);
		insertedName = fullName + genNum;
		FULL_NAME_ELEMENT.sendKeys(insertedName);
	}
	
	public void selectCompanyfromDropDown(String company) {
		selectFromDropdown(COMPANY_NAME_ELEMENT, company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNumber(999) + email);
	}
	
	public void insertPhone(String phone) {
		PHONE_ELEMENT.sendKeys(generateRandomNumber(999) + phone);
	}
	
	public void insertAddress(String address) {
		ADDRESS_ELEMENT.sendKeys(address);
	}
	
	public void insertCity(String city) {
		CITY_ELEMENT.sendKeys(city);
	}
	
	public void insertZipCode(String zipCode) {
		ZIP_CODE_ELEMENT.sendKeys(zipCode);
	}
	
	public void selectCountryFromDropDown(String country) {
		selectFromDropdown(COUNTRY_NAME_ELEMENT, country);
	}
	
	public void selectGroupFromDropDown(String group) {
		selectFromDropdown(GROUP_ELEMENT, group);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickOnSaveButton() {
		SAVE_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
		
	//tbody/tr[1]/td[2]/a
	//tbody/tr[2]/td[2]/a
	//tbody/tr[3]/td[2]/a
	//tbody/tr[i]/td[2]/a
	
	String beforeXpath = "//tbody/tr[";
	String afterXpath = "]/td[2]/a";

	public void validateInsertedCustomer() {
		for (int i = 1; i <= 10; i++) {
			String nameFromList = driver.findElement(By.xpath(beforeXpath + i + afterXpath)).getText();
			System.out.println(nameFromList);
			Assert.assertEquals("New customer is not inserted!!!", nameFromList, insertedName);
			break;
		}
	}
}
