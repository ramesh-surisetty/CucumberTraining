package foxapp.stepdefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class dataTableWithHeadersStepDef {

	@Given("my credentails with headers")
	public void my_credentails_with_headers(DataTable dataTable) {
		
		List<List<String>> creds = dataTable.asLists();
		
		System.out.println("\n username is : "+creds.get(1).get(0));
		System.out.println(" password is : "+creds.get(1).get(1) +"\n");
		
		System.out.println(" ---------------------- ");
		
		List<Map<String, String>> creds1 = dataTable.asMaps();
		
		System.out.println("\n username is : "+creds1.get(0).get("username"));
		System.out.println(" password is : "+creds1.get(0).get("password") +"\n");

	}
	
	
	@Given("my student Data with headers")
	public void my_student_data_with_headers(DataTable dataTable) {
		
		List<List<String>> studentData = dataTable.asLists();
		
		System.out.println("Student info 1 student name :" +studentData.get(1).get(0) );
		System.out.println("Student info 1 student colg name :" +studentData.get(1).get(1) );

		System.out.println("Student info 2 student id :" +studentData.get(2).get(2) );
		System.out.println("Student info 2 student surname :" +studentData.get(2).get(3) );
		
		
		System.out.println("-----------------------------------");
		
		List<Map<String, String>> studentinfo = dataTable.asMaps();

		System.out.println("Student info 1 student name :" +studentinfo.get(0).get("studentname") );
		System.out.println("Student info 1 student colg name :" +studentinfo.get(0).get("collegename"));

		System.out.println("Student info 2 student id :" +studentinfo.get(1).get("ID") );
		System.out.println("Student info 2 student surname :" +studentinfo.get(1).get("Surname"));
		

	}

	
}
