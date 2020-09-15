package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.abstracts.AuthorRepository;
import com.spring.applibrary.dal.concrete.AuthorDal;
import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    public void save(Author author) {
        authorRepository.save(author);

    }
    @Override
    public void deleteById(int id) {
        authorRepository.deleteById(id);
    }

    @Override
    public Optional<Author> findById(int id) {
        return authorRepository.findById(id);
    }

}
