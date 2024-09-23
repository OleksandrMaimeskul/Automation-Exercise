Feature: Contact Us Form Submission

  Scenario: Successfully submit the Contact Us form
    Given User is on the home page and clicks on the Contact Us button
    Then User should see the Get In Touch heading
    When User enters "John Doe" in the name field
    And User enters "john.doe@example.com" in the email field
    And User enters "Inquiry about services" in the subject field
    And User enters "I would like to know more about your services." in the message field
    And User uploads the file "path/to/sample.txt"
    And User clicks the Submit button
    Then User should see the success message "Success! Your details have been submitted successfully."
    When User clicks the OK button
    And User clicks the Home button
    Then User should land on the home page