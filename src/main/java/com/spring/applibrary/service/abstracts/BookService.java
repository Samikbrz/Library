package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    List<Book> getAll();
    void save(Book book);
    void deleteById(int id);
    List<Book> findByKeyword(String keyword);
    Optional<Book> findById(int id);
    void update(Book book);
}
