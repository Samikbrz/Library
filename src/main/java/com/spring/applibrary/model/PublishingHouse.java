package com.spring.applibrary.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PublishingHouse {
    @Id
    private int id;

    @NotNull
    private String publishHouseName;

    private String description;

    public PublishingHouse(int id, String publishHouseName, String description) {
        this.id = id;
        this.publishHouseName = publishHouseName;
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
        return publishHouseName;
    }

    public void setPublishHouseName(String publishHouseName) {
        this.publishHouseName = publishHouseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
