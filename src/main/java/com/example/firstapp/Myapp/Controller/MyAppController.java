package com.example.firstapp.Myapp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {
	
	//RequestMapping
	@RequestMapping(value = "/myapp", method = RequestMethod.GET,produces = {"application/json"})
	public String myMethod() {
		return "First mapping";
	}
	//Getmapping

}
