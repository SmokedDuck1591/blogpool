package com.jeon.blogpool.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20, unique = true, name = "user_id")
    private String userId;

    @Column(nullable = false, length = 30, unique = true, name = "nickname")
    private String userNickname;

    @Column(length = 50)
    private String password;

    @Column(nullable = false, length = 50, unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
