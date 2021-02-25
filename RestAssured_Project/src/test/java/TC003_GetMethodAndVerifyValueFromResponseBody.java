import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class TC003_GetMethodAndVerifyValueFromResponseBody {
	
	@Test(description="Verifying test cases TC01, TC02, TC03")
	 public static void verifyvaluesfrompath() {
	     
		
		Response resp=given().when().get("https://reqres.in/api/users");

	     System.out.println(resp.path("total").toString());

	     assertEquals(resp.getStatusCode(),200);
	     Reporter.log("TC01: To validate the status code is : "+200);
	     
	     assertEquals(resp.path("total").toString(),"12");
	     Reporter.log("TC02: To validate the response body path 'total=12'");
	     
	     assertEquals(resp.path("total_pages").toString(),"2");
	     Reporter.log("TC03: To validate the response body path 'total_pages=2'");
	     
	     
}

}
