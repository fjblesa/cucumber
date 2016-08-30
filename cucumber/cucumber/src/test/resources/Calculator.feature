Feature: Calculator accumulate total
	As a calculator user
	I want to sum and subtract numbers sequentially
	to be able to calculate the total sum value of a large list of numbers
	Scenario: Without operations totals is 0
		Given a calculator
		Then the operation total is 0
	Scenario: Add 2 positive numbers
		Given a calculator
		When adds a number 5
		And adds a numbers 4
		Then the operation total is 9
	Scenario: Subtract from 0 results in negative numbers
		Given a calculator
		When adds a number 0
		And subtract 1
		Then the operation total is -1