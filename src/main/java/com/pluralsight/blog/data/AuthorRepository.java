package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.pluralsight.blog.model.Author;

// Assume we don’t want to allow browsing the authors at all, we only want authors to be displayed within a Post
@RepositoryRestResource(exported = false)
public interface AuthorRepository extends JpaRepository<Author, Long> {}
