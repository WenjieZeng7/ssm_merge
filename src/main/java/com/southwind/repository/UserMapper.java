package com.southwind.repository;

import com.southwind.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-03-01 20:34
 */
//这里不需要注解，因为已经MyBatis的已经交给IOC去管理了，会自动注入。
public interface UserMapper {
    /*** 添加用户信息 */
    int insertUser();

    /**
     * 修改
     */
    void updateUser();

    /**
     * 查询实体类对象
     */
    List<User> getUserById();

    /**
     * 查询所有
     */
    List<User> getAllUser();
}
