package com.luv2code.spring_boot_library.service;

import com.luv2code.spring_boot_library.dao.UserRepository;
import com.luv2code.spring_boot_library.entity.User;
import com.luv2code.spring_boot_library.requestmodels.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Transactional
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;

    }
    public boolean login(UserRequest userRequest){
        String password=userRequest.getPassword();
        String userEmail=userRequest.getUserEmail();

        User user1=userRepository.findByUserEmail(userEmail);
        if(user1!=null){
            if(Objects.equals(user1.getPassword(), password)){
                return true;
            }
            else{
                return  false;
            }
        }
        else{
            return false;
        }
    }
}
