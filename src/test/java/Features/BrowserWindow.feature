Feature: Windows test functionality
  Scenario: User open tab ,window,window message
    Given User open page
    When User click new tab
    Then User click new window
    And user click new window message
