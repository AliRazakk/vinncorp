Feature: Simple Microsoft Teams Integration form

Scenario: Submission of Microsoft Teams Integration form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Microsoft Teams Integration Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message