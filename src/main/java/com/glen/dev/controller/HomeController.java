package com.glen.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String Home() {
		System.out.println("출력 ");
		return "index";
	}
}
