package com.ProjectWithMarketSecurity.dao;


import com.ProjectWithMarketSecurity.dto.RegisterUserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<RegisterUserDto, Long> {
    RegisterUserDto findByName (String name);

    void delete(long id);
}
