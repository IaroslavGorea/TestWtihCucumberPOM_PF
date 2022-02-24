Feature: Alert test functionality
  Scenario: User open and close all modal wind.
    Given WedPage is Open
    When User Click Button to see alert
    Then User click alert will appear after  seconds
    And User click confirm box will appear
    Then User click prompt box will appear
