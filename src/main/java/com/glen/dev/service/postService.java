package com.glen.dev.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.glen.dev.jpa.Posts;
import com.glen.dev.jpa.postsRepository;

@Service
@RunWith(SpringRunner.class)
@SpringBootTest
public class postService {
	
	@Autowired
	private postsRepository repository;
	
	@After
	public void cleanup() {
		repository.deleteAll();
	}
	
	public List<Posts> findAll(){
		List<Posts> array = new ArrayList<>();
		repository.findAll().forEach(e -> array.add(e));
		return array;
	}
	
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
	
	public boolean updateById(String id, String name) {
		Optional<Posts> post = repository.findById(id);
		boolean result = false;
		
		if(post.isPresent()) {
			repository.save(Posts.builder()
					.id(id)
					.name(name)
					.build());
			result = true;
		}
		return result;
	}

}
