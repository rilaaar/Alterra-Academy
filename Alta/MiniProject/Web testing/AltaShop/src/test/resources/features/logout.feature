Feature: Logout
  As a user
  I want to logout my account
  So I can back to login page again

  @Logout
  Scenario: I want to logout my account
    Given I am on the home page
    And I am on logged account
    And I click user icon
    When I click logout button
    Then My account success logout


