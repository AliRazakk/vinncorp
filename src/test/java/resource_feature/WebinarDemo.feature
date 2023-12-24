Feature: Simple Webinar Demo Form Susmission

  Scenario: Webinar Demo form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Webinar Demo Form
    And click on Submit button
    Then Verify Success message