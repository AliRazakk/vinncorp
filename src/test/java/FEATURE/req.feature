Feature: Simple Request a Demo Form Susmission

  Scenario: Submit REQ Form
    Given Launch browser
    When open URL "https://deploy-preview-2460--legendary-monstera-200afd.netlify.app/"
    And Click on Request a Demo button
    And Fillout email and click On Next button
    And Fillout First Name, Last Name, Phone Fields and click on next button
    And Fillout Company, Employees, Country, Interest Fields and click on Submit button
    Then Verify Success message