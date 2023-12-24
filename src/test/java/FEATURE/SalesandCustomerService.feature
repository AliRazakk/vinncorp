Feature: Simple Salesand Customer Service form

Scenario: Submission of Sales and Customer Service form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Sales and Customer Service Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message