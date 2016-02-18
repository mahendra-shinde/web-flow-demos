package com.mahendra.swf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello.htm")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String startFlow(){
		System.out.println("Redirecting to flow...");
		return "test";
	}
}
