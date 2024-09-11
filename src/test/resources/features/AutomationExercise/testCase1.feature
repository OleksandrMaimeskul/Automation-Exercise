Feature: Test case 1 from Automation Exercise

  Scenario Outline: Register User
    Given User verify that 'Home' page is visible successfully
    And User click on signUp_Login button and verify that 'New User Signup!' is visible
    And User enter '<name>' and '<email>' and click SignUp button
    And User validate that 'ENTER ACCOUNT INFORMATION' is visible
    And User enter '<password>' ,'7','7','1992'
    And User enter '<firstName>','<lastName>','<company>','<address>','<address2>','<state>','<city>','<zipCode>','<mobileNumber>',
    And User click to Create Account button and verify 'ACCOUNT CREATED!' is visible
    And User click continue button and verify that 'Logged in as username' is visible
    Examples:
      | name      | email                    | password | firstName | lastName  | company | address               | address2   | state | city    | zipCode | mobileNumber |
      | Olehandro | abrsssakadabra@gmail.com | 12345678 | Oleksandr | Maimeskul | MyOwn   | 2611 Somewhere Street | Office 222 | TX    | Houston | 77445   | 3455433454   |
