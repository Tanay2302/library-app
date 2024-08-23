package com.luv2code.spring_boot_library.controller;

import com.luv2code.spring_boot_library.service.UserService;
import com.luv2code.spring_boot_library.requestmodels.UserRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }


    @PostMapping("/login")
    public boolean login(@RequestBody UserRequest userRequest){
        return userService.login(userRequest);
    }
}
