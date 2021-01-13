package com.wv.mfaraji.exercises;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	public String sayHi(@RequestParam String name) {
		return "Hi " + name + "!";
	}
}
