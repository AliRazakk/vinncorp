Feature: Simple Government form

Scenario: Submission of Government form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Government Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message