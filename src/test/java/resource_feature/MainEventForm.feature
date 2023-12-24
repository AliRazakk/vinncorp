Feature: Simple Main Event Form Susmission

  Scenario: Main Event form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Main Event Form
    And click on Submit button
    Then Verify Success message