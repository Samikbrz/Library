package com.spring.applibrary.dal;

import com.spring.applibrary.model.PublishingHouse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository
        extends CrudRepository<PublishingHouse,Integer> {

}
