package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.BookDal;
import com.spring.applibrary.model.Book;
import com.spring.applibrary.service.abstracts.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {

    private final BookDal bookDal;

    public BookManager(BookDal bookDal) {
        this.bookDal = bookDal;
    }

    @Override
    public List<Book> getAll() {
        return bookDal.findAll();
    }
}
