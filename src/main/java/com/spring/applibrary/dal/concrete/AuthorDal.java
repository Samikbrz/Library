package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.AuthorRepository;
import com.spring.applibrary.model.Author;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class AuthorDal implements AuthorRepository {

    private final EntityManager entityManager;

    @Autowired
    public AuthorDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Author> findAll() {
        Session session= entityManager.unwrap(Session.class);
        List<Author> authors=session.createQuery("select a from Author a" ,Author.class).getResultList();
        return  authors;
    }

    @Override
    public Iterable<Author> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Author> S save(S s) {
        Session session= entityManager.unwrap(Session.class);
        session.createQuery("create " ,Author.class);
        return s;
    }

    @Override
    public <S extends Author> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Author> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

}
