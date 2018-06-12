package com.lingnan.entity;

/**
 * Created by Administrator on 2018/6/5.
 */
public class Category {

    private int id;
    private String name;

    public Category(){
        System.out.println(this);
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
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
}
