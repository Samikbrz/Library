package com.spring.applibrary.api;

import com.spring.applibrary.model.Book;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;
    private final ModelAndView modelAndView=new ModelAndView();

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public ModelAndView getAll(){
        modelAndView.setViewName("bookslist");
        modelAndView.addObject("book",bookService.getAll());
        return modelAndView;
    }

    @RequestMapping("/addnewbook")
    public ModelAndView newBooksIndex() {
        modelAndView.setViewName("addnewbook");
        return modelAndView;
    }

    @PostMapping("/savenewbook")
    public String saveBook(Book book) {
        bookService.save(book);
        return "redirect:/api/books";
    }
}
