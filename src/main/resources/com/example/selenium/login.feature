@login
Feature: Login Action

  As a vodafone customer,
  when I enter my credentials, I should be logged in with my account,
  so that I can check my account information.

  Scenario: Login with invalid credentials
    Given I visit url "http://www.vodafone.co.nz/"
    When I click "My Vodafone" link
    Then I should be navigated to "http://www.vodafone.co.nz/using-myvodafone/"
    When I click "Login" link
    Then I should be navigated to "https://www.vodafone.co.nz/knox/login_handler.jsp"
    When I enter "John" in "username" input field
    And I enter "password" in "password" input field
    And I click "Sign in" button
    Then I should get a wrong message "Your email address is not registered for My Vodafone."
