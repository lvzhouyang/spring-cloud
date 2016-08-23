package com.lzy.model;

import java.io.Serializable;

/**
 * Created by lvzhouyang on 16/8/23.
 */
public class User implements Serializable{
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
