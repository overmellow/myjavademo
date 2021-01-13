package com.wv.mfaraji.exercises;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
}
