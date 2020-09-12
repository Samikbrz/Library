package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors",method = RequestMethod.GET)
    public ModelAndView getAll() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("authorslist");
        modelAndView.addObject("author",authorService.getAll());
        return modelAndView;
    }

    @PostMapping("/addnewauthor")
    public Author saveAuthor(@RequestBody Author author){
        return authorService.save(author);
    }
}












