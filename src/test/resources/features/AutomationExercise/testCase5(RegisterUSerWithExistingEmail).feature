#@regression
Feature: Validation of register of User with existing email and name

  Scenario Outline: Negative scenario of register user with existing email
    Given User click on signUp/Login button
    And User enter '<name>' and '<email>' and click SignUp button
    Then User validate '<ExistingEmailmessage>' which occured due to use of existing user email
    Examples:
      | name      | email                                  | ExistingEmailmessage         |
      | Olehandro | WhatIsWonderfulEmail2ForTest@gmail.com | Email Address already exist! |