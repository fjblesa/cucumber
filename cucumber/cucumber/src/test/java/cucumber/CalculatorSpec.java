package cucumber;

import org.junit.Assert;

import cucumber.api.java8.En;

public class CalculatorSpec implements En {
	Calculator _calculator;
	public CalculatorSpec() {
	
		Given("^a calculator$", () -> {
			_calculator = new Calculator();
		});
		Then("^the operation total is (\\d+)$", (Integer arg1) -> {
			Assert.assertEquals(arg1,_calculator.getResult());
		});
		When("^adds a number (\\d+)$", (Integer arg1) -> {
			_calculator.add(arg1);
		});
		And("^adds a numbers (\\d+)$", (Integer arg1) -> {
			_calculator.add(arg1);
		});
		Then("^the operation total is (\\d+)$", (Integer arg1) -> {
			Assert.assertEquals(arg1,_calculator.getResult());
		});
		When("^adds a number (\\d+)$", (Integer arg1) -> {
			_calculator.add(arg1);
		});
		And("^subtract (\\d+)$", (Integer arg1) ->{
			_calculator.minus(arg1);
		});
		Then("^the operation total is -(\\d+)$", (Integer arg1) -> {
			Assert.assertEquals(arg1,_calculator.getResult());
		});
}
}