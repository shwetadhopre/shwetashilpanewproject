package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@PostMapping("/add")
	public String add()
	{
		
		System.out.println("insert add valuee");
		return "done Successfully";
	}

}
