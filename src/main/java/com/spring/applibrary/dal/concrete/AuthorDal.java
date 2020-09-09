package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.EntityRepository;
import com.spring.applibrary.model.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AuthorDal implements EntityRepository<Author> {

    private final EntityManager entityManager;

    @Autowired
    public AuthorDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Author> getAll() {
        Session session= entityManager.unwrap(Session.class);
        List<Author> authors=session.createQuery("from Author ",Author.class).getResultList();
        return  authors;
    }

    @Override
    public void add(Author entity) {

    }

    @Override
    public void update(Author entity) {

    }

    @Override
    public void Delete(Author entity) {

    }
}
