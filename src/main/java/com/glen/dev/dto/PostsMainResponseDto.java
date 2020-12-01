package com.glen.dev.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import com.glen.dev.jpa.Posts;

import lombok.Getter;

@Getter
public class PostsMainResponseDto {

	private int no;
	private String id;
	private String name;
	private String createddate;
	private String modifieddate;
	
	public PostsMainResponseDto(Posts entity) {
		this.no = entity.getNo();
		this.id = entity.getId();
		this.name = entity.getName();
		this.createddate = toStringDateTime(entity.getCreateddate());
		this.modifieddate = toStringDateTime(entity.getModifieddate());
	}
	
	public String toStringDateTime(LocalDateTime time) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return Optional.ofNullable(time)
				.map(dtf::format)
				.orElse("");
	}
}
