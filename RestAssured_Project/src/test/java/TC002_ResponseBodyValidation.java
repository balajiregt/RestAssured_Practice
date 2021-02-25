import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
public class TC002_ResponseBodyValidation {
	
@Test
public void simple_response_validation() {

	//RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("https://gorest.co.in/public-api/users");

	// Retrieve the body of the Response
	// To check for sub string presence get the Response body as a String.
	// Do a String.contains
	String body=response.getBody().asString();
	System.out.println("Response Body: "+body);
	Reporter.log( "TC01: Response body is: "+body, true );

	String expvalue="Dharani Dhawan";
	Assert.assertEquals(body.contains(expvalue) /*Expected value*/, true /*Actual Value*/, "Response body contains the name");
	Reporter.log( "TC02: Response body contains: "+expvalue, true );
		
}

}
