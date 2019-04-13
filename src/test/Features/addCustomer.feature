
Feature: AddCustomer
  I want to add customer details

  @tag1
  Scenario: Addcustomer Details
    Given The User in the add Customer Page
    When The User fill in the customer details
    |skhsd|sfdnl|snfsld@fsj.com|chennai|1234567890|
    And The user clicks the submit button
    Then The user should see the Customer ID
    