package steps;
import io.cucumber.java.en.And;

import java.util.List;
import java.util.Map;

public class loginDatatable {
	@And("user enter {string} and {string}")
	public void user_enter_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
//	   List<List<String>> data= dataTable.asLists();
//	   System.out.println("First Name: "+data.get(0).get(0));
//	   System.out.println("First Name: "+data.get(0).get(1));
		
		List<Map<String,String>>map=dataTable.asMaps();
		System.out.println("First Name is: "+map.get(0).get("firstname"));
		System.out.println("First Name is: "+map.get(0).get("lastname"));
		
	}
}
