package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.PublishingHouseDal;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublishingHouseManager implements PublishingHouseService {

    private final PublishingHouseDal publishingHouseDal;

    @Autowired
    public PublishingHouseManager(PublishingHouseDal publishingHouseDal) {
        this.publishingHouseDal = publishingHouseDal;
    }

    @Override
    public List<PublishingHouse> getAll() {
        return publishingHouseDal.findAll();
    }
}
