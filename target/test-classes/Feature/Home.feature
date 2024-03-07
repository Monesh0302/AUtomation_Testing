Feature: Automation Testing for Home Tab

  @Sanity
  Scenario: Home Tab functionality
    Given Launch the "chrome" browser
    And Enter the application URL "https://demo.automationtesting.in/Register.html"
    When Click the home tab
    And click the Skip Signin button
    Then validate it is a Register page
