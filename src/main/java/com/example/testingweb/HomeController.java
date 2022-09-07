package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping("/")

	private static final String Greeting = "Finaliza el curso DevOps Foundation v2 - Germán Contreras";
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public @ResponseBody String greeting() {
		return Greeting;
	}

}
