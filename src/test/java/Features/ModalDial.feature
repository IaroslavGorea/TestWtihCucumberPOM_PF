Feature: Modal windows test functionality
  Scenario: User  open modal window
    Given User click window
    And User close window
    Then User open second window
    And User close window