import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; //there are some packages in Rest Assured which are static in nature by using this statement those packages will be automatically imported
import static org.hamcrest.Matchers.*; // this liberay has been aded so 

import files.payload;

public class TrainingBasics {
	
	public static void main(String[] args) {
		//validate if Add place API is working as expected 
		//As rest Assured works on three principles that Given When Then, these three methods will be used in every automation test
		// Given---> will the take all the input details to submit for an API
		// when ---. submit the API ( like get? post? whatever) resource ,https methods
		// THEN----. You will validate the response
		
		// Now below we are going to write Rest Assured test
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String response=given().log().all().queryParam("key","qaclick").header("Content-Type","application/json")
		.body(payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();		
		
		//System.out.println();
		// Add place-> Update place with New Address -> Get place to validate if new address is present in response
		// for this as you already know how to add address 
		
		
		
		
	}
	
	

}
