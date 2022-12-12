Feature: data table concepts

Scenario: SINGLE ROW WITH NO HEADER
	Given my credentials
	|john|
	|john123|
	
		
	Scenario: SINGLE ROW WITH NO HEADER DATA IN HORIZONTAL
	Given my credentials in horizaontal table
	|john|john123| 

	
	Scenario: MULTIPLE ROWS WITH NO HEADER
	Given my user credentials in multiple rows without header
		|john       |john123 |
		|rupeshbaba |	rupeshbaba |
