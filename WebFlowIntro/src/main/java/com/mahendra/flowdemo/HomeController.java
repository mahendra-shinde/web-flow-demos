package com.mahendra.flowdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home.do")
public class HomeController {

	@RequestMapping(method=RequestMethod.GET)
	public String process(){
		return "redirect:membership.do";
	}
}
