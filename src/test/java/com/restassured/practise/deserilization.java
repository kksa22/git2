package com.restassured.practise;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class deserilization {
	@Test
	public void tc2() throws JsonParseException, JsonMappingException, IOException {
	ObjectMapper c=new ObjectMapper();
	
	pojoclass cs = c.readValue(new File("./rest.json"),pojoclass.class);
	System.out.println(cs.pname);
	System.out.println(cs.status);
	System.out.println(cs.projectid);
	System.out.println(cs.teamsize);
	
	}
}
