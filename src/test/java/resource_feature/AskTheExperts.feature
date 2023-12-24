Feature: Simple Ask The Experts Form Susmission

  Scenario: Ask The Experts form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Ask The Experts Agent Form
    And click on Submit button
    Then Verify Success message