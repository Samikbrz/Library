package com.spring.applibrary.dal;

import com.spring.applibrary.model.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublishingHouseRepository
        extends JpaRepository<PublishingHouse,Integer> {

}
