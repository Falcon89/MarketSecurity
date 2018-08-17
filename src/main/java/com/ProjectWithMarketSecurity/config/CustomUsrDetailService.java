//package com.ProjectWithMarketSecurity.config;
//
//import lombok.extern.apachecommons.CommonsLog;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Map;
//import java.util.Optional;
//import java.util.TreeMap;
//
//@Component
//public class CustomUsrDetailService implements UserDetailsService {
//
//    private Map<String, UserDetails> myUsers;
//
//    public CustomUsrDetailService() {
//        myUsers = new TreeMap<>();
//        myUsers.put("user1", new User("user1", "123", Arrays.asList(new SimpleGrantedAuthority("USER"))));
//    }
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return Optional.ofNullable(myUsers.get(username))
//                .orElseThrow(() -> new UsernameNotFoundException("Not fount"));
//    }
//
//
//    {
//
//
//    }
//}
