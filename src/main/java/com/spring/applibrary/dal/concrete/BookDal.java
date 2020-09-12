package com.spring.applibrary.dal;

import com.spring.applibrary.model.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class BookDal implements CrudRepository<Book,Integer> {

    private final EntityManager entityManager;

    @Autowired
    public BookDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

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
        Session session=entityManager.unwrap(Session.class);
        List<Book> books=session.createQuery("select b from Book b",Book.class).getResultList();
        return books;
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
