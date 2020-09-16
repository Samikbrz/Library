package com.spring.applibrary.service.abstracts;

import com.spring.applibrary.model.PublishingHouse;

import java.util.List;

public interface PublishingHouseService {
    List<PublishingHouse> getAll();
    void save(PublishingHouse publishingHouse);
    void deleteById(int id);
}
