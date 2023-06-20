package com.restassured.practise;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

public class serilization {
	
	@Test
	public void tc1() throws JsonGenerationException, JsonMappingException, IOException {
		

	
	pojoclass p=new pojoclass(10,"Api",3,"pass");

	ObjectMapper c=new ObjectMapper();
	c.writeValue(new File("./rest.json"), p);
	
	
	
	
	}
	
}
