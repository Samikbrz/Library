package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.EntityRepository;
import com.spring.applibrary.model.Book;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class BookDal implements EntityRepository<Book> {

    private final EntityManager entityManager;

    @Autowired
    public BookDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> getAll() {
        Session session=entityManager.unwrap(Session.class);
        List<Book> books=session.createQuery("from Book",Book.class).getResultList();
        return books;
    }

    @Override
    public void add(Book entity) {

    }

    @Override
    public void update(Book entity) {

    }

    @Override
    public void Delete(Book entity) {

    }
}
