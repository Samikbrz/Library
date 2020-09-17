package com.spring.applibrary.dal.concrete;

import com.spring.applibrary.dal.abstracts.PublishingHouseRepository;
import com.spring.applibrary.model.PublishingHouse;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public class PublishingHouseDal implements PublishingHouseRepository {


    @Override
    public <S extends PublishingHouse> S save(S entity) {
        return null;
    }

    @Override
    public <S extends PublishingHouse> Iterable<S> saveAll(Iterable<S> entities) {
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
    public Iterable<PublishingHouse> findAll() {
        return null;
    }

    @Override
    public Iterable<PublishingHouse> findAllById(Iterable<Integer> integers) {
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
    public void delete(PublishingHouse entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PublishingHouse> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
