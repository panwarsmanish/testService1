package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Testing;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/service1")
public class RestController {

	@GetMapping
	public String value() {
		Testing test = new Testing();
		return "service 1 deployed, embedded object value is :" + test.value;
	}
}
