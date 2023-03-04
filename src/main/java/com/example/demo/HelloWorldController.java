package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class HelloWorldController   
{  
	
	Map<String, User> userDetails = new HashMap();
	
	@RequestMapping("/test")  
	public String hello() {  
		return "Hello javaTpoint";  
	} 	
	
}
