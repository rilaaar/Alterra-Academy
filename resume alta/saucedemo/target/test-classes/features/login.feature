Feature: Login
  As a user
  I want to login
  So I can access my dashboard

  @Login
  Scenario Outline: Login with account
    Given I am on the login page
    When I input "<username>" username
    And I input "<password>" password
    And I click Login button
    Then I will get the "<result>"
    Examples:
      | username | password | result |
#      |          |          | i can't login |
#      |          | secret_sauce | i can't login |
#      | standard_user |          | i can't login |
      | standard_user | secret_sauce | i can login |
#      | locked_out_user | secret_sauce | i can't login |
#      | problem_user | secret_sauce | i can login |
#      | performance_glitch_user | secret_sauce | i can login |

#  Scenario: Login with valid username and valid password
#    Given I am on the login page
#    When I input valid username
#    And I input valid password
#    And I click Login button
#    Then I will go to dashboard
#
#  Scenario: Login with locked account
#    Given I am on the login page
#    When I input locked username
#    And I input valid password
#    And I click Login button
#    Then I will get error message
#
#  Scenario: Login with problem account
#    Given I am on the login page
#    When I input problem username
#    And I input valid password
#    And I click Login button
#    Then I will go to dashboard
#
#  Scenario: Login with performance glitch account
#    Given I am on the login page
#    When I input performance glitch username
#    And I input valid password
#    And I click Login button
#    Then I will go to dashboard