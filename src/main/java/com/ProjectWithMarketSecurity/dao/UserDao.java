package com.ProjectWithMarketSecurity.dao;



import com.ProjectWithMarketSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByName (String name);


}
