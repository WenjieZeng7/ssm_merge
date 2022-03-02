package com.southwind.service.impl;

import com.southwind.pojo.User;
import com.southwind.repository.UserMapper;
import com.southwind.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-02 20:39
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
