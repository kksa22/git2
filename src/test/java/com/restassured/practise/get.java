package com.restassured.practise;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class get {
	@Test
	public void tc1() {
		JSONObject a=new JSONObject();
		a.put("name","abc@gmaile.com");
		a.put("job","abcewe");
		
		given()
		
		.contentType(ContentType.JSON)
		.body(a)
		
		
		
		.when()
		.post("https://reqres.in/api/users/848")
		.then().log().all()
		.assertThat().statusCode(201);
		
		
	}

}
