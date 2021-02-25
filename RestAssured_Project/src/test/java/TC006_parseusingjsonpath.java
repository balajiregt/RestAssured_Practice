import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertThat;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.xsom.impl.scd.Iterators.Map;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC006_parseusingjsonpath {
@Test
public static void parsingarraylistsusingjsonpath() {
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("https://jsonplaceholder.typicode.com/users/");

	//parsing arraylist using Map
	java.util.Map<Object, Object> company = response.jsonPath().getMap("company[0]");
	System.out.println(company.get("name"));
	
	//parsing arrays
	String usernames = response.jsonPath().getString("username");
	System.out.println(usernames);
	
	//parsing arrays using list
	java.util.List<Object> jsonResponse = response.jsonPath().getList("username");
	System.out.println(jsonResponse.get(0));
}
}
