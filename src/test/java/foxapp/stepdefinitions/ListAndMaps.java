package foxapp.stepdefinitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMaps {

	public static void main(String[] args) {
		
		//list save in indexes
		List creds = new ArrayList();
		
		List userdata1 = new ArrayList();
		userdata1.add("john");  //0
		userdata1.add("john1234"); //1
		
		List userdata2 = new ArrayList();
		userdata2.add("rupeshbaba"); //0
		userdata2.add("rupeshbabapws"); //1
		
		creds.add(userdata1); //0
		creds.add(userdata2); //1
		
		System.out.println("List of Lists : "+((List) creds.get(1)).get(1));
		
		
		Map map1 = new HashMap<String,String>();
		map1.put("username", "john"); //k,v
		map1.put("password", "john1234"); //k,v
		

		Map map2 = new HashMap<String,String>();
		map2.put("username", "rupeshbaab");
		map2.put("password", "rupeshbabapwd");
		
		List<Map> creds1 = new ArrayList<Map>();
		creds1.add(map1); //0
		creds1.add(map2); //1
		
		
		System.out.println("List of Maps : "+	creds1.get(1).get("username") );
		
		
		
	}
}
