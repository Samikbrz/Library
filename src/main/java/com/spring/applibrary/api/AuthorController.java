package com.spring.applibrary.api;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class AuthorController {

    private AuthorService authorService;
    private final ModelAndView modelAndView=new ModelAndView();

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public AuthorController() { }

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
        boolean isexist=false;
        List<Author> authors=authorService.getAll();
        for (int i=0;i<authors.size();i++){
            if (authors.get(i).getAuthorName().contains(author.getAuthorName())){
                isexist=true;
            }
        }
        if (!isexist){
            authorService.save(author);
        }
        return "redirect:/api/authors";
    }

    @RequestMapping("/findbyid")
    @ResponseBody
    public Optional<Author> findById(int id)
    {
         return authorService.findById(id);
    }

    @RequestMapping(value = "/updateauthor",method = {RequestMethod.PUT,RequestMethod.GET})
    public String updateAuthor(Author author){
        authorService.update(author);
        return "redirect:/api/authors";
    }

    @RequestMapping(value = "/deleteauthor",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String deleteAuthor(int id){
        authorService.deleteById(id);
        return "redirect:/api/authors";
    }
}












