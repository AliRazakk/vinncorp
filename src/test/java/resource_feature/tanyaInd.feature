Feature: Simple Tanya Pakar Cpaas (Indonasia) Form Susmission

  Scenario: Tanya Pakar Cpaas form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Tanya Pakar Form
    And click on Submit button
    Then Verify Success message