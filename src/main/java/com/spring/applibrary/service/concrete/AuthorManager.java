package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.concrete.AuthorDal;
import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorManager implements AuthorService {

    private final AuthorDal authorDal;

    @Autowired
    public AuthorManager(AuthorDal authorDal) {
        this.authorDal = authorDal;
    }

    @Override
    @Transactional()
    public List<Author> getAll() {
        return authorDal.getAll();
    }

    @Override
    public void add(Author author) {
        authorDal.add(author);
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public void Delete(Author author) {

    }
}
