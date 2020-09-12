package com.spring.applibrary.dal;

import com.spring.applibrary.model.Author;
import com.spring.applibrary.model.PublishingHouse;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class PublishingHouseDal implements CrudRepository<PublishingHouse,Integer> {

    private final EntityManager entityManager;

    @Autowired
    public PublishingHouseDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public <S extends PublishingHouse> S save(S s) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<PublishingHouse> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<PublishingHouse> findAll() {
        Session session= entityManager.unwrap(Session.class);
        List<PublishingHouse> publishingHouses=session.createQuery("select a from PublishingHouse a" ,PublishingHouse.class).getResultList();
        return  publishingHouses;
    }

    @Override
    public Iterable<PublishingHouse> findAllById(Iterable<Integer> iterable) {
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
    public void delete(PublishingHouse publishingHouse) {

    }

    @Override
    public void deleteAll(Iterable<? extends PublishingHouse> iterable) {

    }

    @Override
    public void deleteAll() {

    }


}
