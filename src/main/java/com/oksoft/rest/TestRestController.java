package com.oksoft.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oksoft.props.DemoConfigProps;

@RestController
public class TestRestController {

	@Autowired
	private DemoConfigProps configProps;
	
	@GetMapping("/welcome")
	public String getwelcomeMsg() {
		
		return configProps.getProperties().get("welcomeMsg");
		//return configProps.getWelcomeMsg();
				
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		return configProps.getProperties().get("greetMsg");
	   // return configProps.getGreetMsg();
	}
	@GetMapping("/test")
	public String testMsg() {
		return configProps.getProperties().get("testMsg");
		//return configProps.getTestMsg();
	}
}
