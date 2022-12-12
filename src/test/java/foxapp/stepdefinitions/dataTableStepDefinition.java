package foxapp.stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class dataTableStepDefinition {

	
	@Given("my credentials")
	public void my_credentials(DataTable dataTable) {
	   
		List<String> creds = dataTable.asList();
		
		System.out.println("\nUsername is : "+creds.get(0));
		System.out.println("password is : "+creds.get(1)+"\n");

		
	}
	
	@Given("my credentials in horizaontal table")
	public void my_credentials_in_horizaontal_table(DataTable dataTable) {
		
		List<String> creds = dataTable.row(0);
		
		System.out.println("\nUsername is : "+creds.get(0));
		System.out.println("password is : "+creds.get(1));
		
		
		List<String> creds1 = dataTable.values();
		System.out.println("\nUsername is : "+creds1.get(0));
		System.out.println("password is : "+creds1.get(1));
	}

	
	@Given("my user credentials in multiple rows without header")
	public void my_user_credentials_in_multiple_rows_without_header(DataTable dataTable) {
		List<List<String>> creds = dataTable.asLists();
		

		System.out.println("\nUsername 1 is : "+creds.get(0).get(0));
		System.out.println("password 1 is : "+creds.get(0).get(1)+"\n");
		

		System.out.println("\nUsername 2 is : "+creds.get(1).get(0));
		System.out.println("password 2 is : "+creds.get(1).get(1)+"\n");

	}
}
