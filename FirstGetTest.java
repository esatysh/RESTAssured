import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FirstGetTest {

	
	@Test
	public void getWeatherDetails()
	{
	
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.request(Method.GET,"/Chennai");
		
		String responseBody=response.getBody().asString();
		System.out.println("The response is:  "+responseBody);
		
	}
}
