Feature: Adding new customer functionality validation with driving the data from MySQL database
	@Regression1
	Scenario: User should be able to add new customer information from MySQL database
		Given User is on the CodeFios URL page
		When User enters the username as "username" from DB
		When User enters the password as "password" from DB
		And User hits on the Sighin button
		Then User should land on dashboard page of CodeFios
		When User hits on the Customer menu
		And User hits on the Add Customer menu
		Then User should land on Add New Customer page of CodeFios
		When User enters the fullName as "fullname" from DB
		When User enters the compny as "company" from DB
		When User enters the email as "email" from DB
		When User enters the phone as "phone" from DB
		When User enters the address as "address" from DB
		When User enters the city as "city" from DB
		When User enters the zipCode as "zipCode" from DB
		When User enters the country as "country" from DB
		When User enters the group as "group" from DB
		And User hits on the save button
		Then User should see the inserted customer information