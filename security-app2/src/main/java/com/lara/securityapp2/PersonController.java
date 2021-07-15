package com.lara.securityapp2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	//Creting PostMapping API to test on ARC
	@PostMapping("/test1")
	public String test1()
	{
		System.out.println("from test1");
		return"from test1";
	}
	
	@GetMapping("/hello1")					// ADMIN
	public String hello1()
	{
		System.out.println("from hello1");
		return "from hello1";
	}
	
	@RequestMapping("/hello2")					// ADMIN
	public String hello2()
	{
		System.out.println("from hello2");
		return "from hello2";
	}
	
	@GetMapping("/hello3")					// USER
	public String hello3()
	{
		System.out.println("from hello3");
		return "from hello3";
	}
	
	@GetMapping("/hello4")					// USER
	public String hello4()
	{
		System.out.println("from hello4");
		return "from hello4";
	}
	
	

}
