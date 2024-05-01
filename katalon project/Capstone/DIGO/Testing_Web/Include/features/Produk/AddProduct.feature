
@AddProduct
Feature: Add Product
  User want to add new product 

  Scenario Outline: I want to add new product item
    Given I set an url admin website
    When I am on the dashboard
    And I go to product page
    And I click add button
    And I input <product> product name, category, <minTrans> minimum transaction and <coin> coin transaction
    And I click create button
    Then The product success added
    
    Examples: 
      | product | minTrans |	coin	|
      | E-Money | 	10000  |	10		|