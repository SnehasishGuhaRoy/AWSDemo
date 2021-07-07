package com.example.awsexample.cntlr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcmCtrlr {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
