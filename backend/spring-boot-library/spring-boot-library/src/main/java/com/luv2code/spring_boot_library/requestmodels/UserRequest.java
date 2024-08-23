package com.luv2code.spring_boot_library.requestmodels;

import lombok.Data;

@Data
public class UserRequest {
    private String userEmail;
    private String password;
}
