package com.github.yun.shiro.server.dao;

import com.github.yun.shiro.server.entity.User;

import java.util.List;

/**
 * @author Administrator
 * <p>Date:
 * <p>Version: 1.0
 */
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
