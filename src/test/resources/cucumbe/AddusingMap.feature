#Sample Feature Definition Template
Feature: To test add customer functionality

  Scenario: To verify whether the customer ID is generated or not
    Given The user is in add customer page now
    When The user fill in valid customer details with data
      | fname   | sarala         |
      | lname   | subramanian    |
      | email   | sara@gmail.com |
      | address | chennai        |
      | phNum   |      987797987 |
    When The user clicks submit button in the page
    Then The user should see the customer id generated at the end
