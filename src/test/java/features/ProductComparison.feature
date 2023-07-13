Feature: Product Comparison
  Tests the functionality to add and remove products from the Compare Product page

  Background:
    Given The user must be on the Home page

  Scenario: Verify if a user not logged in can add products to compare - multiple products view
    Given the user identified "Argus All-Weather Tank" as their product of interest
    When the user hovers over "Argus All-Weather Tank" and clicks the Add to Compare button
    Then a confirmation message, "You added product Argus All-Weather Tank to the comparison list." should be displayed
    And the "Argus All-Weather Tank" should be added in the Compare Products screen

  Scenario: Verify if a user not logged in can add products to compare - product details view
    Given the user identified "Argus All-Weather Tank" as their product of interest
    When the user clicks "Argus All-Weather Tank" product name
    And clicks ADD TO COMPARE link of the product
    Then a confirmation message, "You added product Argus All-Weather Tank to the comparison list." should be displayed
    And the "Argus All-Weather Tank" should be added in the Compare Products screen
