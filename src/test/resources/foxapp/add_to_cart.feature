
Feature: Add to cart
	
@Smoke	
Scenario Outline: Add one qauntity from store
	Given I'm on the store page
	When I add a "<product name>" to the cart
	Then I should see 1 "<product name>" in the cart
	Examples:
		|product name|
		|Blue Shoes|
		|Anchor Bracelet|
		
		
 @DE2134
 Scenario: check dryrun option
  Given Dry run option verifying		
	