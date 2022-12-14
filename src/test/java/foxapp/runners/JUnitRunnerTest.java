package foxapp.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features= {"src/test/resources/foxapp"},
			glue="foxapp.stepdefinitions",
			tags="@Regression and @DE2134"
		
		)

public class JUnitRunnerTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println(" Before Class will run before any scenario executes");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println(" After Class will run after all scenario executes");

	}
}
