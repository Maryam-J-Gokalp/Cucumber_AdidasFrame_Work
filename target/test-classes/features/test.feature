Feature: Purchase Functionality of DemoBlaze Application
  As a buyer, I should be able navigate through products
  so that I can purchase from application online

  @smoke
  Scenario: Adding product to cart
    Given buyer is on the homepage of demoblaze
    When buyer adds from "Laptops" category "Sony vaio i5" product to cart
    And buyer clicks on "Cart" link

