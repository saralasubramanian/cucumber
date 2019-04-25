
#Sample Feature Definition Template
@tag
Feature: To test add tariff plan using pom

 @tag2
  Scenario Outline: To verify add tariff plan with valid details using pom
    Given The user is in add tariff plan 
    When The user fill in valid plan details with data "<monthRent>","<FreeLoc>","<FreeInteg>","<TreeSMS>","<LocCharg>","<IntCharg>","<SMSCharge>"
    When The user clicks submit button using pom
    Then The user should see the sucess message

    Examples: 
      | monthRent | FreeLoc | FreeInteg | TreeSMS | LocCharg | IntCharg | SMSCharge |
      |      09167 |    67819 |      12486 |    24315 |     31456 |      4561 |      34516 |
      |      09611 |    17189 |      11486 |    14135 |     14156 |      41156|       4156 |
      |      39671 |    61739 |      24136 |    21433 |     34513 |      3156 |       1456 |
