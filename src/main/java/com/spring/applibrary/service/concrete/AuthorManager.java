package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.AuthorDal;
import com.spring.applibrary.model.Author;
import com.spring.applibrary.service.abstracts.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
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
        return authorDal.findAll();
    }

}
