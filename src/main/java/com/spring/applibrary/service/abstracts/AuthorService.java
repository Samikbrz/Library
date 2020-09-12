package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();
    Author save(Author author);
}
