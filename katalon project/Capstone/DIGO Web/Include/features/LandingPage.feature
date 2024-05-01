
@LPage
Feature: Landing Page
  User want to view landing page DIGO Website

  @Home
  Scenario: User want to go Home Page 
    Given I set an url 
    When I am on the home page
    Then Home page succsess showed

  @About
  Scenario: User want to go About Page 
    Given I set an url 
    When I am on the home page
    And I click about
    Then About page succsess showed
    
   @Features
  Scenario: User want to go Features Page 
    Given I set an url 
    When I am on the home page
    And I click feature
    Then Features page succsess showed
    
   @Contact
  Scenario: User want to go Contact Page 
    Given I set an url 
    When I am on the home page
    And I click contact
    Then Contact page succsess showed
    