package com.spring.applibrary.model;

import javax.persistence.*;

@Entity
@Table(name = "publishing_house")
public class PublishingHouse {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "publishing_house_name")
    private String publishingHouseName;

    @Column(name = "description")
    private String description;


    public PublishingHouse(int id, String publishingHouseName, String description) {
        this.id = id;
        this.publishingHouseName = publishingHouseName;
        this.description = description;
    }

    public PublishingHouse(){}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishingHouseName() {
        return publishingHouseName;
    }

    public void setPublishingHouseName(String publishingHouseName) {
        this.publishingHouseName = publishingHouseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
