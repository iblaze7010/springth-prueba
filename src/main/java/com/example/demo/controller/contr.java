package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contr {
	
	@GetMapping("/siu")
	public String hello() {
		return "index";
	}
}
