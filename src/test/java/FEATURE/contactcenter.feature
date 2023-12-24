Feature: Simple Contact Center Form Susmission

  Scenario: Submit Contact Center Form
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Contact Center Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message