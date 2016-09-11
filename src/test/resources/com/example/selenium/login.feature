Feature: Login Action

  Scenario: Unsuccessful login with invalid credentials
    Given I open vodafone
    And I click on My Vodafone in the top right corner menu
    And I click login on the next page
    When I enter "test" as username and "test" as password in text box
    Then I should get wrong messages