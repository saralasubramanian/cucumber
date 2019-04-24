#sample feature definition templates
Feature: To test add customer functionality

  
  Scenario: To verify the customer ID is generated
    Given  The user is in add customer page
    When The user fill in valid customer details
    |sarala|subramanian|sara@gmail.com|chennai|8879097987|
     When The user clicks submit button
     Then The user should see the customer id generated
    
