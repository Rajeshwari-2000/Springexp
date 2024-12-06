package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController 
{
	public HelloController() {
		super();
		System.out.println("helloController");
	}


	@GetMapping("/")
	public String welcomefile() {
		return "index";
	}

	
	@GetMapping("/hello")
	public String sayhello() {
		return "hello";
	}
	@GetMapping("/Message")
	public ModelAndView getMessage() {
		String message="this is message from getMessage";
		return new ModelAndView("showmessage","msg",message);
		
	}
}
