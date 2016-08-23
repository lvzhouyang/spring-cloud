package com.lzy.service;

import com.lzy.dao.UserMapper;
import com.lzy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lvzhouyang on 16/8/23.
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> searchAll(){
        List<User> list = userMapper.findAll();
        return list;
    }
}
