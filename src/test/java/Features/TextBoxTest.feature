Feature: Validation test
  Scenario Outline: User send full name ,address ,email , permanent address
    Given WebSite demoqa.com/text-box is open
    When sends <name> and <email> and <currentAddress> and <permanentAddress>
    Then user push submit
    Examples:
    |name    |email               |currentAddress|permanentAddress|
    |iaroslav|regaman101@gmail.com|Chisinau      |Chisinau        |
