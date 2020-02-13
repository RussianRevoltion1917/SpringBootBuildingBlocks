package com.rohit.restservicers.springbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//@RequestMapping(method=RequestMethod.GET, path="/HelloWorld")
	@GetMapping("/HelloWorld1")
	public String HelloWorld()
	{
		return "Hello World1";
	}
	@GetMapping("/HelloWorld-bean")
	public UserDetails helloWorldBean(){
		return new UserDetails("Rohit", "Gupta", "Faizabad");
	}
	

}
