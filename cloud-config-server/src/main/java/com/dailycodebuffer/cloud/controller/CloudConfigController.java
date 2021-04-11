package com.dailycodebuffer.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configServer")
public class CloudConfigController {
	
	
	@GetMapping("/configTest")
	public String configTest()
	{
		return " In Config Server";
	}
	
	

}
