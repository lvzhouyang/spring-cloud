package com.lzy.dao;

import com.lzy.model.User;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/23.
 */
public interface UserMapper {
    List<User> findAll();
}
