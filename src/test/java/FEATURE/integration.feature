Feature: Simple Integration Form Susmission

  Scenario: Submit Integration Form
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Integration Form
    And Scroll page Till Integration Form
    And Fill All Integration the Form
    And click on Submit button
    Then Verify Success message