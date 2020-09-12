package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.abstracts.BookRepository;
import com.spring.applibrary.dal.concrete.BookDal;
import com.spring.applibrary.model.Book;
import com.spring.applibrary.service.abstracts.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {

    private final BookRepository bookRepository;

    public BookManager(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAll() {
        return (List<Book>) bookRepository.findAll();
    }
}
