package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = { "resources:Calculator.feature" })
@RunWith(Cucumber.class)
public class CalculatorTest {
}
