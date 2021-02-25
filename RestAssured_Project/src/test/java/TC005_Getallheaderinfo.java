import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TC005_Getallheaderinfo {
	
	@Test
	public static void headerinfo() {
		//RestAssured.baseURI = "https://restapi.demoqa.com/utilities/weather/city";
		 RequestSpecification httpRequest = RestAssured.given();
		 Response response = httpRequest.get("https://gorest.co.in/public-api/users");
		 
		 // Get all the headers. Return value is of type Headers.
		 // Headers class implements Iterable interface, hence we
		 // can apply an advance for loop to go through all Headers
		 // as shown in the code below
		 Headers allHeaders = response.headers();
		 {
		 
		 // Iterate over all the Headers
		 for(Header header : allHeaders)
		 {
		 System.out.println(header.getName() +": "+ header.getValue());
		 }
		 Reporter.log("TC01: All the header key values are printed here");
		}
	}
	
}
