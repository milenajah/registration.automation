@stories

Feature: Registration  on utest page

  As a user I want to be able to register entering my data on the page

  @scenario1
  Scenario Outline: tell us about yourself

    Given than milena registers on the utest page
    When she enter personal data


      |strName  |strLastName| strEmailAddress|
      |<strName> |<strLastName>| <strEmailAddress>|

    Examples:
      |strName  |strLastName| strEmailAddress|
      | constanza | Jaimes | milenajaimes0628@gmail.com |


  Scenario: add your address
    Given than Milena visualizes the title add your address
    When she enter your location


  Scenario: tell us about your device
    Given than Milena visualizes the title tell us about your device
    When she enter your device data


  Scenario Outline: the last step
    Given than Milena visualizes the title The last step
    When entering your password information
      | strPassword   | strConfirmPassword  |
      | <strPassword> | <strConfigPassword> |

    Then accept the terms of use and privacy



    Examples:
      | strPassword | strConfigPassword |
      | Prueba01*$  | Prueba01*$        |