package com.shubham.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shubham.springframework.spring5webapp.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
