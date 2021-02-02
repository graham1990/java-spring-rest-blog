package com.pluralsight.blog.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.pluralsight.blog.model.Post;


public interface PostRepository extends JpaRepository<Post, Long> {
	
	// Allows search http://localhost:8080/posts/search/containsTitle?title=Smart
	@RestResource(rel="contains-title", path="containsTitle")
	public List<Post> findByTitleContaining(String title);	
	// Allows search http://localhost:8080/posts/search/findByTitleContaining?title=Smart

	//http://localhost:8080/posts/search/findByAuthor_Lastname?lastname=Holderness
	public List<Post> findByAuthor_Lastname(String lastname);
}
