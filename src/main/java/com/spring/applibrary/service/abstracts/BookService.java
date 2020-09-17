package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    void save(Book book);
    void deleteById(int id);
    List<Book> findByKeyword(String keyword);
}
