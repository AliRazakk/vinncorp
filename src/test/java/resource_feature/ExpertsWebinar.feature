Feature: Simple Ask the Experts Webinar Form Susmission

  Scenario: Expert Webinar form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill Expert Webinar Form
    And click on Submit button
    Then Verify Success message