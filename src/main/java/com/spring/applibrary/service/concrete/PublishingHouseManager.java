package com.spring.applibrary.service.concrete;

import com.spring.applibrary.dal.PublishingHouseRepository;
import com.spring.applibrary.model.PublishingHouse;
import com.spring.applibrary.service.abstracts.PublishingHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PublishingHouseManager implements PublishingHouseService {

    private final PublishingHouseRepository publishingHouseRepository;

    @Autowired
    public PublishingHouseManager(PublishingHouseRepository publishingHouseRepository) {
        this.publishingHouseRepository = publishingHouseRepository;
    }

    @Override
    public List<PublishingHouse> getAll() {
        return (List<PublishingHouse>) publishingHouseRepository.findAll();
    }

    @Override
    public void save(PublishingHouse publishingHouse) {
        publishingHouseRepository.save(publishingHouse);
    }

    @Override
    public void deleteById(int id) {
        publishingHouseRepository.deleteById(id);
    }

    @Override
    public Optional<PublishingHouse> findById(int id) {
        return publishingHouseRepository.findById(id);
    }

    @Override
    public void update(PublishingHouse publishingHouse) {
        publishingHouseRepository.save(publishingHouse);
    }
}
