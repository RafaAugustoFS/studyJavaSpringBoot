package com.raff.study_spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.raff.study_spring_app.domain.User;
import com.raff.study_spring_app.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
	@GetMapping("/get")
	public String helloWorld() {
		return helloService.hello("Rafa");
	}
	
	@PostMapping("/{id}")
	public String helloPost(@PathVariable("id") String id, @RequestBody User body) {
		return "POST " + body.getName() + id;
	}
	
}
