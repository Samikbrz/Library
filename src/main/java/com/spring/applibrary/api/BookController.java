package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.model.Book;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.AuthorService;
import com.spring.applibrary.service.abstracts.BookService;

import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;
    private final PublishingHouseService publishingHouseService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService, PublishingHouseService publishingHouseService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.publishingHouseService = publishingHouseService;
    }

    @RequestMapping("/books")
    public String getAll(Model model,@Param("keyword") String keyword ){
        List<Author> authors=authorService.getAll();
        List<PublishingHouse> publishingHouses=publishingHouseService.getAll();
        model.addAttribute("publishingHouse",publishingHouses);
        model.addAttribute("author",authors);
        if (keyword!=null){
            model.addAttribute("book",bookService.findByKeyword(keyword));
        }
        else{
            model.addAttribute("book",bookService.getAll());
        }
        return "bookslist";
    }

    @RequestMapping("/addnewbook")
    public String newBooksIndex(Model model) {
        List<Author> authors=authorService.getAll();
        List<PublishingHouse> publishingHouses=publishingHouseService.getAll();
        model.addAttribute("publishingHouse",publishingHouses);
        model.addAttribute("author",authors);
        return "addnewbook";
    }

    @PostMapping("/savenewbook")
    public String saveBook(Book book) {
        bookService.save(book);
        return "redirect:/api/books";
    }

    @RequestMapping(value = "/deletebook",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteBook(int id){
        bookService.deleteById(id);
        return "redirect:/api/books";
    }

    @RequestMapping("/findbybookid")
    @ResponseBody
    public Optional<Book> findById(int id){
        return bookService.findById(id);
    }

    @RequestMapping(value = "/updatebook",method = {RequestMethod.PUT,RequestMethod.GET})
    public String updateBook(Book book){
        bookService.update(book);
        return "redirect:/api/books";
    }
}
