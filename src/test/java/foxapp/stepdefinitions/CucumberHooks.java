package foxapp.stepdefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

	
	@BeforeAll
	public static void beforeAllFromCucumber() {
		System.out.println("Running Before ALL hook");
	}
	
	
	@AfterAll
	public static void afterAllFromCucmber() {
		System.out.println("Running After ALL hook");

	}
	
}
