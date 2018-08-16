package com.ProjectWithMarketSecurity.service;

import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public interface UserService {
//    void update(RegisterUserDto registerUserDto);

    void save(RegisterUserDto registerUserDto);

    List<RegisterUserDto> findAll();

    RegisterUserDto findOne(long id);

    void delete(long id);

}
