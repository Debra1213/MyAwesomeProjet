package com.tts.myAwesomeProject.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	@RequestMapping("/demo")
	public String home()
	{
		return "Hello World!";

	}
}