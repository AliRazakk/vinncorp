Feature: Simple Collaboration & Mobility Form Submission from Solutions

Scenario: Submission of Collaboration & Mobility Form

    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to Collaboration & Mobility Form
    And Scroll page Till Form
    And Fill All the Form
    And click on Submit button
    Then Verify Success message