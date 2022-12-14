

Feature: Data Table Concept with headers 

@Regression
Scenario: SINGLE ROW WITH HEADER
	Given my credentails with headers
	|username | password |
	|John     | john123  |
	
	
@Regression	@DE2134
Scenario: MULTIPLE ROWS WITH HEADER
	Given my student Data with headers
	|studentname |collegename | ID    |Surname     |
	|Ravi        |Simhadri    |U4rTKP | Surisetty  |
	|Ramesh      | Diet       | UYTRE | Surisetty1 |