package com.spring.applibrary.api;

import com.spring.applibrary.service.abstracts.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public ModelAndView getAll(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("bookslist");
        modelAndView.addObject("book",bookService.getAll());
        return  modelAndView;
    }
}
