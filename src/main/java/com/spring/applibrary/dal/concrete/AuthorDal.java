package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.AuthorRepository;
import com.spring.applibrary.model.Author;

import java.util.Optional;


public class AuthorDal implements AuthorRepository {


    @Override
    public <S extends Author> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Author> Iterable<S> saveAll(Iterable<S> entities) {
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

    @Override
    public Iterable<Author> findAll() {
        return null;
    }

    @Override
    public Iterable<Author> findAllById(Iterable<Integer> integers) {
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
    public void delete(Author entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
