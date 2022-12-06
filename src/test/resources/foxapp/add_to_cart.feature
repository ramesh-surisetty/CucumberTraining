
Feature: Add to cart

Scenario: Add one qauntity from store
	Given I'm on the store page
	When I add a "Blue Shoes" to the cart
	Then I should see 1 "Blue Shoes" in the cart


Scenario: Add one qauntity from store
	Given I'm on the store page
	When I add a "Anchor Bracelet" to the cart
	Then I should see 1 "Anchor Bracelet" in the cart