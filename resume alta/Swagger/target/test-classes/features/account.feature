#Feature: Get all account features
#  As a user
#  I want to get all account features
#  So I can manage all of the features
#
#  Scenario: Get all account features with valid token
#    Given I set an url and valid token to get all account features
#    When I request get account features
#    Then I will get 200
#    And Get list all features
#
#  Scenario: Get all account features with invalid token
#    Given I set an url and invalid token to get all account features
#    When I request get account features
#    Then I will get 401
#    And Get forbidden message