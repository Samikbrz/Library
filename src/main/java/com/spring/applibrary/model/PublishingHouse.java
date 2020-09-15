package com.spring.applibrary.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "publishing_house")
public class PublishingHouse {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(name = "publishing_house_name")
    private String publishingHouseName;

    @Column(name = "description")
    private String description;

    public PublishingHouse(int id, String publishHouseName, String description) {
        this.id = id;
        this.publishingHouseName = publishHouseName;
        this.description = description;
    }

    public PublishingHouse(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublishHouseName() {
        return publishingHouseName;
    }

    public void setPublishHouseName(String publishHouseName) {
        this.publishingHouseName = publishHouseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
