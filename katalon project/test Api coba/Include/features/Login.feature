@login
Feature: Login Feature
  I want to use this template for my feature file

 @loginsuccess
  Scenario Outline: Method POST login Successfully
    Given Set method to POST-001
    When Set URL https://alta-shop.herokuapp.com/api/auth/login-001
    And Set body using Test Data-001 
    And Send Request-001
    Then Show the verify result 200 OK-001