package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {
    List<Author> getAll();
    void save(Author author);
    void deleteById(int id);
    Optional<Author> findById(int id);
}
