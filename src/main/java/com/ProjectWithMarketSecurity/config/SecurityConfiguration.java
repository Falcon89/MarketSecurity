package com.ProjectWithMarketSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;

/**
 * Created by admin on 2/3/2018.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder
                .userDetailsService(this.userDetailsService)
                .passwordEncoder(passwordEncoder());
    }
    private CsrfTokenRepository csrfTokenRepository()
    {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setSessionAttributeName("_csrf");
        return repository;
    }

    @Bean
    public UserDetailsService UserDetailsService() {
        return super.userDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .csrfTokenRepository(csrfTokenRepository());
        http

                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?fail=true")
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .deleteCookies("JSESSIONID", "Secret_cookei")
                .and()
                .authorizeRequests()

                .antMatchers("/admin").hasRole("ADMIN")
                .antMatchers("/adminPage").hasAnyRole("ADMIN","USER")
                .antMatchers("/adminDetailedOrdersUpdate/{id}").hasAnyRole("ADMIN")
                .antMatchers("/adminDetailedOrdersUpdate").hasAnyRole("ADMIN")
//                .antMatchers("/adminForm").hasRole("USER")
                .antMatchers("/adminOrders").hasAnyRole("ADMIN","USER")
                .antMatchers("/adminDetailedOrders").hasAnyRole("ADMIN","USER")
//                .antMatchers("/adminTables").hasRole("ADMIN")
                .antMatchers("/adminProductUpdate").hasAnyRole("ADMIN")
                .antMatchers("/adminProductUpdate/{id}").hasAnyRole("ADMIN")
                .antMatchers("/adminProfil").hasAnyRole("ADMIN","USER")
                .antMatchers("/adminRegistration").hasRole("ADMIN")
                .antMatchers("/adminProduct").hasRole("ADMIN")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/adminDetailedOrdersCatalogue").hasAnyRole("ADMIN","USER")
//                .antMatchers("/adminDetailedOrdersCatalogue/**").hasRole("ADMIN")
                .anyRequest().permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ADMIN");
    }

}
