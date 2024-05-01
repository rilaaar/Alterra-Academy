
Feature: Login

  Scenario Outline: Test register with valid user
    Given User navigate to login page
    When Click icon arrow Login1
    And User enters email <email> field in Login
    And User enters password <password> field in Login
    And Click on login button in login page
    Then User is navigate to homepage

    Examples: 
      | email  | password | 
      | rilaaarn@gmail.com |Rilaafhrila15! |
      | rilaaar | 123455 |
