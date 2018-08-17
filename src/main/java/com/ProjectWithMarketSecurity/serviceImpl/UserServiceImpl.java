package com.ProjectWithMarketSecurity.serviceImpl;

import com.ProjectWithMarketSecurity.dao.UserDao;

import com.ProjectWithMarketSecurity.entity.Role;
import com.ProjectWithMarketSecurity.entity.User;
import com.ProjectWithMarketSecurity.service.UserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserDetailsService, UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private BCryptPasswordEncoder encoder;
    @Override
    public void save(User user) {
user.setPassword(encoder.encode(user.getPassword()));
user.setRole(Role.ROLE_USER);
userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public User findByName(String name) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
