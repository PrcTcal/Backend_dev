package com.glen.dev.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.glen.dev.vo.testVO;

@Repository
@Mapper
public interface testMapper {
	List<testVO> selectTest();
}
