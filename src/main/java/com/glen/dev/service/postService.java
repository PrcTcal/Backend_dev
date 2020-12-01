package com.glen.dev.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;

import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.glen.dev.dto.PostsMainResponseDto;
import com.glen.dev.jpa.Posts;
import com.glen.dev.jpa.postsRepository;

import lombok.AllArgsConstructor;

@Service
@RunWith(SpringRunner.class)
@SpringBootTest
@AllArgsConstructor
public class postService {
	
	private postsRepository repository;
	
	@After
	public void cleanup() {
		repository.deleteAll();
	}
	
	@Transactional(readOnly=true)
	public List<Posts> findAll(){
		List<Posts> array = new ArrayList<>();
		repository.findAll().forEach(e -> array.add(e));
		return array;
	}
	
	@Transactional(readOnly=true)
	public List<PostsMainResponseDto> findAllDesc(){
		return repository.findAllDesc()
				.map(posts -> new PostsMainResponseDto(posts))
				.collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Optional<Posts> findById(String id){
		Optional<Posts> post = repository.findById(id);
		return post;
	}
	
	public Posts save(Posts post) {
		repository.save(post);
		return post;
	}
	
	@Transactional
	public void deleteById(String id) {
		repository.deleteById(id);
	}
	
	public void updateById(String id, String name) {
		Optional<Posts> post = repository.findById(id);
		
		post.ifPresent(updatePost -> {
			repository.save(Posts.builder()
					.id(id)
					.name(name)
					.build());
		});
	}

}
