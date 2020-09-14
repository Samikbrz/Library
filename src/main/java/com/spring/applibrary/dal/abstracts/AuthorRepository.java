package com.spring.applibrary.dal.abstracts;

import com.spring.applibrary.model.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository
        extends CrudRepository<Author,Integer> {
}
