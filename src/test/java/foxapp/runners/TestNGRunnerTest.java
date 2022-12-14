package foxapp.runners;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
		features= {"src/test/resources/foxapp"},
		glue="foxapp.stepdefinitions",
		tags="@Regression or @DE2134",
		dryRun=false,
		monochrome=false,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"}
		

		)


public class TestNGRunnerTest extends AbstractTestNGCucumberTests{

	@BeforeClass
	public static void beforeClass() {
		System.out.println(" Before Class will run before any scenario executes");
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println(" After Class will run after all scenario executes");

	}
	
	
}
