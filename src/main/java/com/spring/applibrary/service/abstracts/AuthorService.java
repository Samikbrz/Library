package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.Author;
import com.sun.xml.bind.v2.model.core.ID;

import java.util.List;

public interface AuthorService {
    List<Author> getAll();
    void save(Author author);
    void deleteById(int id);
}
