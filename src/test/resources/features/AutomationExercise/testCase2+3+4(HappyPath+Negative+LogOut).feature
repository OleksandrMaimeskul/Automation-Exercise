Feature: Validation User Login Functionality
  @regression
  Scenario: Happy Path login with valid credentials
    Given User push SignUp/Login by click the button on the homepage
    And   the user enters the correct 'WhatIsWonderfulEmail2ForTest@gmail.com', '12345678' and push login button
    And Verify that 'Olehandro' is visible

#    Scenario Outline: Negative scenario of Log In with wrong credenential
#      Given User push SignUp/Login by click button on the homepage
#      And   the user enters the incorrect '<email>', '<password>' and push login button
#      Then User verify that '<message>' is visible
#      Examples:
#        | email                | password  | message                              |
#        | wrongemail@gmail.com | 123456789 | Your email or password is incorrect! |

      @regression
      Scenario: Validation Logout Functionality
        Given User push logout button