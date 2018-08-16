package com.ProjectWithMarketSecurity.serviceImpl;

import com.ProjectWithMarketSecurity.dao.UserDao;
import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import com.ProjectWithMarketSecurity.dto.Role;
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
    public void save(RegisterUserDto registerUserDto) {

        registerUserDto.setPassword(encoder.encode(registerUserDto.getPassword()));
        registerUserDto.setRole(Role.ROLE_USER);
        userDao.save(registerUserDto);

    }

    @Override
    public List<RegisterUserDto> findAll() {
        return null;
    }

    @Override
    public RegisterUserDto findOne(long id) {
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
