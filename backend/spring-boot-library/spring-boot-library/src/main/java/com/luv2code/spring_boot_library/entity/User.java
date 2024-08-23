package com.luv2code.spring_boot_library.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "password")
    private String password;

}
