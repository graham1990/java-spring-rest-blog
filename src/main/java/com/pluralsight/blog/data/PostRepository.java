package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.blog.model.Post;


public interface PostRepository extends JpaRepository<Post, Long> {} 