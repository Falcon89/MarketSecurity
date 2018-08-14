package com.ProjectWithMarketSecurity.dto;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class RegisterUserDto {
    @Size(min = 2, max = 30)
    private String username;
    @Email
    private String email;
    private String password;

}
