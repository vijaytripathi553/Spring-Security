package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello1")
	public String hello1()
	{
		System.out.println("from hello 1");
		return "This is my first spring application";
		
	}

}
