package com.ProjectWithMarketSecurity.config;

import com.ProjectWithMarketSecurity.config.userdetails.CustomUserDetails;
import com.ProjectWithMarketSecurity.entity.Role;
import com.ProjectWithMarketSecurity.entity.User;
import com.ProjectWithMarketSecurity.repository.UserRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

@Component
public class CustomUsrDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User Not Found");
        }

        List<Role> roleUser = user.getRoleUser();
        List<GrantedAuthority> authority = new ArrayList<>();

        for (Role role: roleUser) {
            SimpleGrantedAuthority roleOther = new SimpleGrantedAuthority(role.getRole());
            authority.add(roleOther);
        }

        return CustomUserDetails.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .enabled(user.isEnable())
                .authorities(authority)
                .build();
    }
}
