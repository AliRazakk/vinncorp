Feature: Simple How To Engeage Apaas Customer Form Susmission

  Scenario: Engeage Apaas Customer form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Engage Customer Form
    And click on Submit button
    Then Verify Success message