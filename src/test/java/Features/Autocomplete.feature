Feature: Autocomplete in empty fields

    Scenario Outline: User send valid data in empty fields
      Given WebSite is open
      When user send her <address> <strAddress> <strAddress2> data in empty field
      Then user send another data <city> and <state> and <zipcode> and <country>
      And user send enter
      Examples:
      |address|strAddress     |strAddress2       |city        |state   |zipcode      |country       |
      |Moldova|StefanCelMare  | celMareSiSfint   |Chisinau    |State   |MD-4820           |Moldova     |