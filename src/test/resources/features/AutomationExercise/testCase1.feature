@regression
Feature: Test case 1 from Automation Exercise

  Scenario Outline: Register User
    Given User verify that home page is visible successfully with color 'rgba(255, 165, 0, 1)'
    And User click on signUp_Login button and verify that 'New User Signup!' is visible
    And User enter '<name>' and '<email>' and click SignUp button
    And User validate that 'ENTER ACCOUNT INFORMATION' is visible
    And User enter '<password>' ,'7','7','1992'
    And User enter '<firstName>','<lastName>','<company>','<address>','<address2>','<country>','<state>','<city>','<zipCode>','<mobileNumber>',
    And User click to Create Account button and verify 'ACCOUNT CREATED!' is visible
#    And the user clicks the Delete Account button
#    And the user clicks the Continue button
    And User logout by clicking button for next test
    Examples:
      | name      | email                    | password | firstName | lastName  | company | address               | address2   | country|state | city    | zipCode | mobileNumber |
      | Olehandro | WhatIsWonderfulEmail2ForTest@gmail.com | 12345678 | Oleksandr | Maimeskul | MyOwn   | 2611 Somewhere Street | Office 222 | United States |TX    | Houston | 77445   | 3455433454   |

