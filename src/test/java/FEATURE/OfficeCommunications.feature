Feature: Simple Office Communications form

Scenario: Submission of Office Communications form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Office Communications Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message