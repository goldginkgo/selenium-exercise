Feature: Login Action

  Scenario: Login with invalid credentials
    Given I open vodafone's website
    And I click on My Vodafone in the top right corner menu
    And I click login on the next page
    When I enter "sdfdsf" as username and "jinnkn" as password in text box
    Then I get a wrong message
