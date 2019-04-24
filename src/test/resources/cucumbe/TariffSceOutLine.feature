
#Sample Feature Definition Template
@tag
Feature: To test add tariff plan

   

  @tag2
  Scenario Outline: To verify add tariff plan with valid details
    Given The userr is in add tariff plan
    When The userr fill in valid plan details with data "<monthRent>","<FreeLoc>","<FreeInteg>","<TreeSMS>","<LocCharg>","<IntCharg>","<SMSCharge>"
    When The userr clicks submit button
    Then The userr should see the sucess message

    Examples: 
      | monthRent | FreeLoc | FreeInteg | TreeSMS | LocCharg | IntCharg | SMSCharge |
      |      0967 |    6789 |      2486 |    2435 |     3456 |      456 |      3456 |
      |      0961 |    1789 |      1486 |    1435 |     1456 |      4156|       456 |
      |      3967 |    6739 |      2436 |    2433 |     3453 |      356 |       456 |
