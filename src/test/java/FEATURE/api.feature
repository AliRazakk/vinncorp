Feature: Simple APIs: SMS, Voice, Video, Chat Apps Form Susmission

  Scenario: Submit API Form
    Given Launch browser
    When open URL "https://deploy-preview-2439--legendary-monstera-200afd.netlify.app/"
    And Naviagte to API Form
    And Scroll page Till API Form
    And Fill API Form
    And click on Submit button
    Then Verify Success message