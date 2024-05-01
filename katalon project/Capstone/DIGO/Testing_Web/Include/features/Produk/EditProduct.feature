
@EditProduct
Feature: Edit Product
  User want to edit product item

  Scenario Outline: Edit Product
    Given I set an url admin website
    When I am on the dashboard
    And I go to product page
    And I click edit button
    And I input <minTrans> minimum transaction
    And I click save button
    Then The product success edited

    Examples: 
      | minTrans | 
      | 		2		 |
      