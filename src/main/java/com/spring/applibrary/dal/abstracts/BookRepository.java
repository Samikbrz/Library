package com.spring.applibrary.dal.abstracts;

import com.spring.applibrary.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer> {
}
