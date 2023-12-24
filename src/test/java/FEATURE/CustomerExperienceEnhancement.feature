Feature: Simple Customer Experience Enhancement from Solutions

Scenario: Submission of Customer Experience Enhancement Form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Customer Experience Enhancement Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message