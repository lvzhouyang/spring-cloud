package com.lzy.vo;

/**
 * Created by lvzhouyang on 16/8/3.
 */
public class Company {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company() {
    }
}
