Feature: Simple Device Form Susmission

  Scenario: Submit Device Form
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Device Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message


