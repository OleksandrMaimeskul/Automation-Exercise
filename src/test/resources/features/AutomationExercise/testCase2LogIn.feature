Feature: Validation User Login Functionality

  Scenario: Happy Path login with valid credentials
    Given User push SignUp/Login by click the button on the homepage
    And   the user enters the correct 'WhatIsWonderfulEmail2ForTest@gmail.com', '12345678' and push login button
    And Verify that 'Olehandro' is visible