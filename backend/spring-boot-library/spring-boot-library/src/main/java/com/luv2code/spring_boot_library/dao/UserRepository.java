package com.luv2code.spring_boot_library.dao;

import com.luv2code.spring_boot_library.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserEmail(String userEmail);

}
