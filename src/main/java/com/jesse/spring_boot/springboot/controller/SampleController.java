package com.jesse.spring_boot.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@RequestMapping(value="/hello")
	String getHome() {
		return "Hello World";
	}

}
