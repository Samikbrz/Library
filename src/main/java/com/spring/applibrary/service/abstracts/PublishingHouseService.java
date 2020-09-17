package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.PublishingHouse;

import java.util.List;
import java.util.Optional;

public interface PublishingHouseService {
    List<PublishingHouse> getAll();
    void save(PublishingHouse publishingHouse);
    void update(PublishingHouse publishingHouse);
    void deleteById(int id);
    Optional<PublishingHouse> findById(int id);
}
