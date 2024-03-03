$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AddCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Adding new customer functionality validation with driving the data from MySQL database",
  "description": "",
  "id": "adding-new-customer-functionality-validation-with-driving-the-data-from-mysql-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3758175100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to add new customer information from MySQL database",
  "description": "",
  "id": "adding-new-customer-functionality-validation-with-driving-the-data-from-mysql-database;user-should-be-able-to-add-new-customer-information-from-mysql-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Regression1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on the CodeFios URL page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the username as \"username\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters the password as \"password\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User hits on the Sighin button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should land on dashboard page of CodeFios",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User hits on the Customer menu",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User hits on the Add Customer menu",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User should land on Add New Customer page of CodeFios",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters the fullName as \"fullname\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enters the compny as \"company\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters the email as \"email\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters the phone as \"phone\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User enters the address as \"address\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters the city as \"city\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters the zipCode as \"zipCode\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters the country as \"country\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User enters the group as \"group\" from DB",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User hits on the save button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User should see the inserted customer information",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerStepDefination.user_is_on_the_CodeFios_URL_page()"
});
formatter.result({
  "duration": 2895365400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 29
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_username_as_from_DB(String)"
});
formatter.result({
  "duration": 3501668800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_password_as_from_DB(String)"
});
formatter.result({
  "duration": 3120193200,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_hits_on_the_Sighin_button()"
});
formatter.result({
  "duration": 21018332300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_should_land_on_dashboard_page_of_CodeFios()"
});
formatter.result({
  "duration": 244831300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_hits_on_the_Customer_menu()"
});
formatter.result({
  "duration": 3061356700,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_hits_on_the_Add_Customer_menu()"
});
formatter.result({
  "duration": 5998615500,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_should_land_on_Add_New_Customer_page_of_CodeFios()"
});
formatter.result({
  "duration": 162525900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fullname",
      "offset": 29
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_fullName_as_from_DB(String)"
});
formatter.result({
  "duration": 125937800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "company",
      "offset": 27
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_compny_as_from_DB(String)"
});
formatter.result({
  "duration": 168933300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "email",
      "offset": 26
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_email_as_from_DB(String)"
});
formatter.result({
  "duration": 107145400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "phone",
      "offset": 26
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_phone_as_from_DB(String)"
});
formatter.result({
  "duration": 92461800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "address",
      "offset": 28
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_address_as_from_DB(String)"
});
formatter.result({
  "duration": 91122300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "city",
      "offset": 25
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_city_as_from_DB(String)"
});
formatter.result({
  "duration": 87753500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zipCode",
      "offset": 28
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_zipCode_as_from_DB(String)"
});
formatter.result({
  "duration": 92841600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "country",
      "offset": 28
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_country_as_from_DB(String)"
});
formatter.result({
  "duration": 140211800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "group",
      "offset": 26
    }
  ],
  "location": "AddCustomerStepDefination.user_enters_the_group_as_from_DB(String)"
});
formatter.result({
  "duration": 2141027500,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_hits_on_the_save_button()"
});
formatter.result({
  "duration": 78996265300,
  "status": "passed"
});
formatter.match({
  "location": "AddCustomerStepDefination.user_should_see_the_inserted_customer_information()"
});
formatter.result({
  "duration": 260833100,
  "status": "passed"
});
});