Feature: Simple Cpass Thai Form Susmission

  Scenario: Cpass Thai form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Cpaas Thai Form
    And click on Submit button
    Then Verify Success message