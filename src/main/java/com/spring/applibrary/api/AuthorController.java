package com.spring.applibrary.api;

import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@RestController
@RequestMapping("/api")
public class AuthorController {

    private  final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/authors")
    public ModelAndView getAll() {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("authorslist");
        modelAndView.addObject("author",authorService.getAll());
        return  modelAndView;
    }
}












