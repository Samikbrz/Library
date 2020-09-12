package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.abstracts.AuthorRepository;
import com.spring.applibrary.dal.concrete.AuthorDal;
import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorManager implements AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorManager(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    @Transactional()
    public List<Author> getAll() {
        return (List<Author>) authorRepository.findAll();
    }

    @Override
    public Author save(Author author) {
        authorRepository.save(author);
        return author;
    }

}
