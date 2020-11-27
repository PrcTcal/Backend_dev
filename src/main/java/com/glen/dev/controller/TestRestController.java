package com.glen.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.glen.dev.service.testService;
import com.glen.dev.vo.testVO;

@RestController
public class TestRestController {

	@Autowired
	private testService service;
	
	@RequestMapping(value="/getValue")
	public String getValue() {
		return "test Value!";
	}
	
	@RequestMapping(value="/read")
	public List<testVO> read(){
		return service.selectTest();
	}
}
