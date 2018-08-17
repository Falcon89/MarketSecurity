package com.ProjectWithMarketSecurity.config;

import com.ProjectWithMarketSecurity.config.userdetails.CustomUserDetails;
import com.ProjectWithMarketSecurity.entity.User;
import com.ProjectWithMarketSecurity.repository.UserRepository;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

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

        return CustomUserDetails.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .enabled(user.isEnable())
                .authorities(Arrays.asList(new SimpleGrantedAuthority("USER")))
                .build();
    }
}
