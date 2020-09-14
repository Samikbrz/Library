package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLOutput;

@Controller
@RequestMapping("/api")
public class AuthorController {

    private final AuthorService authorService;
    private final ModelAndView modelAndView=new ModelAndView();

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/Index")
    public String index(){
        return null;
    }

    @RequestMapping(value = "/authors",method = RequestMethod.GET)
    public ModelAndView getAll() {
        modelAndView.setViewName("authorslist");
        modelAndView.addObject("author",authorService.getAll());
        return modelAndView;
    }

    @RequestMapping("/addnewauthor")
    public ModelAndView newAuthorIndex() {
        modelAndView.setViewName("addnewauthor");
        return modelAndView;
    }

   @PostMapping("/savenewauthor")
    public String saveAuthor(Author author) {
        if (author.getDescription()!=null){
            authorService.save(author);
        }
        return "redirect:/api/authors";
    }
}












