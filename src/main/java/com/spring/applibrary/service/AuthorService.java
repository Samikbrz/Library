package com.spring.applibrary.service;


import com.spring.applibrary.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();
    void add(Author author);
    void update(Author author);
    void Delete(Author author);
}
