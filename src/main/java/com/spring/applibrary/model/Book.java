package com.spring.applibrary.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private int id;

    @NotNull
    private String Name;
    private String SubName;

    @NotNull
    private String SerialNo;

    @NotNull
    private int author;

    @NotNull
    private String publishingHouse;

    @NotNull
    private String ISBNNumber;

    private String description;

    public Book(int id, String name, String subName, String serialNo, int author, String publishingHouse, String isbnNumber, String description) {
        this.id = id;
        Name = name;
        SubName = subName;
        SerialNo = serialNo;
        this.author = author;
        this.publishingHouse = publishingHouse;
        ISBNNumber = isbnNumber;
        this.description = description;
    }

    public Book(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubName() {
        return SubName;
    }

    public void setSubName(String subName) {
        SubName = subName;
    }

    public String getSerialNo() {
        return SerialNo;
    }

    public void setSerialNo(String serialNo) {
        SerialNo = serialNo;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(String ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
