Feature: Simple Your average Chatbot Form Susmission

  Scenario: Average Chatbot form Submission
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to form
    And Fill your average chatbot Form
    And click on Submit button
    Then Verify Success message