package com.glen.dev.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface postsRepository extends JpaRepository<Posts, Integer>{
	public Optional<Posts> findById(String id);
	public List<Posts> findByName(String name);
	public List<Posts> findByNameLike(String keyword);
	public void deleteById(String id);
}
