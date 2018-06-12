package com.lingnan.entity;

import java.time.LocalDate;

/**
 * Created by Administrator on 2018/6/5.
 */
public class Book {

    private int id;
    private String name;
    private LocalDate publishDate;
    private Category category;


    public Book(){
        System.out.println(this);
    }

    public Book(int id, String name, LocalDate publishDate) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
    }

    public Book(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        System.out.println("setting category");
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
