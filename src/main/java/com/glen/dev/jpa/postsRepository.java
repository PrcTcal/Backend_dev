package com.glen.dev.jpa;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.glen.dev.dto.PostsMainResponseDto;

@Repository
public interface postsRepository extends JpaRepository<Posts, Integer>{
	public Optional<Posts> findById(String id);
	public List<Posts> findByName(String name);
	public List<Posts> findByNameLike(String keyword);
	public void deleteById(String id);
	@Query("SELECT no, id, name, createddate, modifieddate " + 
			"FROM post " +
			"ORDER BY no DESC")
	public Stream<Posts> findAllDesc();
}
