package com.glen.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glen.dev.mapper.testMapper;
import com.glen.dev.vo.testVO;

@Service
public class testService {
	@Autowired
	private testMapper mapper;
	
	public List<testVO> selectTest(){
		return mapper.selectTest();
	}
}
