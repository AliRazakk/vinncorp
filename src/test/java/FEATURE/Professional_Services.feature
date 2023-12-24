Feature: Simple Professional Services form

Scenario: Submission of Professional Services form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Professional Services Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message