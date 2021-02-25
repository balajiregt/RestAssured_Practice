import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC004_QueryParamwithGetMethod {
	@Test
    public void validateQueryParamInGiven() {
       
        Response resp = given().queryParam("page", "1").when().get("https://reqres.in/api/users");

        assertEquals(resp.getStatusCode(),200);
        Reporter.log("TC01: To get the response body by passing the query string to the base url'");
        System.out.println(resp.getBody().asString());
    }
}
