import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_Get_Request {

 
 @Test
 void getweatherDetails()
 {
  //Specify base URI
  //RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
  
  //Request object
  RequestSpecification httpRequest=RestAssured.given();
  
  //Response object
  Response response=httpRequest.request(Method.GET,"https://gorest.co.in/");
  
  //print response in console window
  String responseBody=response.getBody().asString();
  System.out.println("Response Body is:" +responseBody);
  
  //status line verification
  String statusLine=response.getStatusLine();
  System.out.println("Status line is:"+statusLine);
  Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
  
//status code validation
  int statusCode=response.getStatusCode();
  System.out.println("Status code is: "+statusCode);
  Assert.assertEquals(statusCode, 200);
  
  Reporter.log( "TC01: Response body validation: "+responseBody, true );
  Reporter.log( "TC02: Status code validation: "+statusCode, true );
  Reporter.log( "TC03: Status line validation: "+statusLine, true );
 }
  
}