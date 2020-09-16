package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.BookRepository;
import com.spring.applibrary.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookDal implements BookRepository {

    @Override
    public <S extends Book> S save(S s) {
        return null;
    }

    @Override
    public <S extends Book> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Book> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Book> findAll() {
       return null;
    }

    @Override
    public Iterable<Book> findAllById(Iterable<Integer> iterable) {
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
    public void delete(Book book) {

    }

    @Override
    public void deleteAll(Iterable<? extends Book> iterable) {

    }

    @Override
    public void deleteAll() {

    }

}
