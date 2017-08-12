@live
Feature: Search Product
  As a ebay customer
  i want to search the product
  so that i can get that product

  @sanity
 Scenario: Search product from homepage

   Given iam on homepage
   When i search a product in search coloumn
   Then i should get that product only

  @regression
  Scenario: product added to basket

    Given iam on homepage
    When i search a product in search coloumn
    Then i should get that product only
    And added to basket
