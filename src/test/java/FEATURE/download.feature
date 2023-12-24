Feature: Simple Download The App Form Susmission

  Scenario: Submit Download The App Form
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Navigate to download Form
    And Scroll page Till download Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message