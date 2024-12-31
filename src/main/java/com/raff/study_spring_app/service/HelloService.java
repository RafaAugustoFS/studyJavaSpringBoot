package com.raff.study_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	public String hello(String User) {
		return "Hi " + User;
	}
}
