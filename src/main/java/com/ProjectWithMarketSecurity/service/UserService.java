package com.ProjectWithMarketSecurity.service;

import com.ProjectWithMarketSecurity.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> findAll();

    User findOne(long id);

    User findByName(String name);

    void delete(long id);

}
