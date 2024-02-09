package com.bottle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BottleController {

	@GetMapping("msg")
	public String getMsg() {
		return "helo";
	}
	
}
