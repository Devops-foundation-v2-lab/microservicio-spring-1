package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

	public static final String Greeting = "Finaliza el curso DevOps Foundation v2 - Germán Contreras";
	public String greet() {
		return Greeting;
	}
}
