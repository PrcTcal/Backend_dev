package com.glen.dev.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glen.dev.jpa.Posts;
import com.glen.dev.service.postService;
import com.glen.dev.service.testService;
import com.glen.dev.vo.testVO;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TestRestController {

	private testService service;
	private postService pservice;
	
	@RequestMapping(value="/getValue")
	public String getValue() {
		return "test Value!";
	}
	
	@RequestMapping(value="/read")
	public List<testVO> read(){
		return service.selectTest();
	}
	
	@ResponseBody
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public Posts save(@RequestParam String id, @RequestParam String name){
		return pservice.save(Posts.builder()
				.id(id)
				.name(name)
				.build());
	}
	
	@ResponseBody
	@RequestMapping(value="/findById", method = RequestMethod.GET)
	public Optional<Posts> findById(@RequestParam String id){
		return pservice.findById(id);
	}
	
	@ResponseBody
	@RequestMapping(value="updateById", method = RequestMethod.PUT)
	public boolean updateById(@RequestParam String id, @RequestParam String name) {
		return pservice.updateById(id, name);
	}
	
	@ResponseBody
	@RequestMapping(value="/deleteById", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteById(@RequestParam String id) {
		pservice.deleteById(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
