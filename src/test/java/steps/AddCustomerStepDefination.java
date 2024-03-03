package steps;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import pages.AddNewCustomerPage;
import pages.DashboardPage;
import pages.DataBasePage;
import pages.LoginPage;
import pages.TestBase;

public class AddCustomerStepDefination extends TestBase{
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AddNewCustomerPage addNewCustomerPage;
	DataBasePage databasePage;
	
	@Before
	public void initMethod() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class); 
		addNewCustomerPage = PageFactory.initElements(driver, AddNewCustomerPage.class); 
		databasePage = new DataBasePage();
	}

	@Given("^User is on the CodeFios URL page$")
	public void user_is_on_the_CodeFios_URL_page() {
		driver.get("https://www.codefios.com/ebilling/login");
	}

	@When("^User enters the username as \"([^\"]*)\" from DB$")
	public void user_enters_the_username_as_from_DB(String username) {
		loginPage.insertUsername(databasePage.getDataFromDB(username));
	}

	@When("^User enters the password as \"([^\"]*)\" from DB$")
	public void user_enters_the_password_as_from_DB(String password) {
		loginPage.insertPassword(databasePage.getDataFromDB(password));
	}

	@When("^User hits on the Sighin button$")
	public void user_hits_on_the_Sighin_button() {
		loginPage.clickOnSinginButton();
	}

	@Then("^User should land on dashboard page of CodeFios$")
	public void user_should_land_on_dashboard_page_of_CodeFios() {
		Assert.assertEquals("Codefios", loginPage.getPageTitle());
		takeScreenshot(driver);
	}

	@When("^User hits on the Customer menu$")
	public void user_hits_on_the_Customer_menu() {
		dashboardPage.clickOnCustomersMenu();
	}

	@When("^User hits on the Add Customer menu$")
	public void user_hits_on_the_Add_Customer_menu() {
		dashboardPage.clickOnAddCustomerMenu();
	}

	@Then("^User should land on Add New Customer page of CodeFios$")
	public void user_should_land_on_Add_New_Customer_page_of_CodeFios() {
		Assert.assertEquals("Manage Client", dashboardPage.getPageTitle());
		takeScreenshot(driver);
	}

	@When("^User enters the fullName as \"([^\"]*)\" from DB$")
	public void user_enters_the_fullName_as_from_DB(String fullname) {
		addNewCustomerPage.insertFullname(databasePage.getDataFromDB(fullname));
	}

	@When("^User enters the compny as \"([^\"]*)\" from DB$")
	public void user_enters_the_compny_as_from_DB(String company) {
		addNewCustomerPage.selectCompanyfromDropDown(databasePage.getDataFromDB(company));
	}

	@When("^User enters the email as \"([^\"]*)\" from DB$")
	public void user_enters_the_email_as_from_DB(String email) {
		addNewCustomerPage.insertEmail(databasePage.getDataFromDB(email));
	}

	@When("^User enters the phone as \"([^\"]*)\" from DB$")
	public void user_enters_the_phone_as_from_DB(String phone) {
		addNewCustomerPage.insertPhone(databasePage.getDataFromDB(phone));
	}

	@When("^User enters the address as \"([^\"]*)\" from DB$")
	public void user_enters_the_address_as_from_DB(String address) {
		addNewCustomerPage.insertAddress(databasePage.getDataFromDB(address));
	}

	@When("^User enters the city as \"([^\"]*)\" from DB$")
	public void user_enters_the_city_as_from_DB(String city) {
		addNewCustomerPage.insertCity(databasePage.getDataFromDB(city));
	}

	@When("^User enters the zipCode as \"([^\"]*)\" from DB$")
	public void user_enters_the_zipCode_as_from_DB(String zipCode) {
		addNewCustomerPage.insertZipCode(databasePage.getDataFromDB(zipCode));
	}

	@When("^User enters the country as \"([^\"]*)\" from DB$")
	public void user_enters_the_country_as_from_DB(String country) {
		addNewCustomerPage.selectCountryFromDropDown(databasePage.getDataFromDB(country));
	}

	@When("^User enters the group as \"([^\"]*)\" from DB$")
	public void user_enters_the_group_as_from_DB(String group) {
		addNewCustomerPage.selectGroupFromDropDown(databasePage.getDataFromDB(group));
	}

	@When("^User hits on the save button$")
	public void user_hits_on_the_save_button() {
		addNewCustomerPage.clickOnSaveButton();
	}

	@Then("^User should see the inserted customer information$")
	public void user_should_see_the_inserted_customer_information() {
		Assert.assertEquals("Manage Client", addNewCustomerPage.getPageTitle());
		addNewCustomerPage.validateInsertedCustomer();
		takeScreenshot(driver);
	}
	
	//@After
	public void tearDown(){
		driver.close();
		driver.quit();
	}
}
