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
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Repository
public class PublishingHouseDal implements JpaRepository<PublishingHouse,Long> {

    private final EntityManager entityManager;

    @Autowired
    public PublishingHouseDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<PublishingHouse> findAll() {
        Session session= entityManager.unwrap(Session.class);
        List<PublishingHouse> publishingHouses=session.createQuery("select a from PublishingHouse a" ,PublishingHouse.class).getResultList();
        return  publishingHouses;
    }

    @Override
    public List<PublishingHouse> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PublishingHouse> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PublishingHouse> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

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

    @Override
    public <S extends PublishingHouse> S save(S s) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<PublishingHouse> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PublishingHouse> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<PublishingHouse> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PublishingHouse getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PublishingHouse> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PublishingHouse> boolean exists(Example<S> example) {
        return false;
    }
}
