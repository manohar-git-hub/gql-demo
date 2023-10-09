package com.gql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@QueryMapping
	private String hi()
	{
		return "Test";
	}public TestController() {
		// TODO Auto-generated constructor stub
	}
	@MutationMapping
	private String insert(@Argument String name) {
		return "Welcome! " +name;
	}
	

}
