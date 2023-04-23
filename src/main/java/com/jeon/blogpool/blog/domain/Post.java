package com.jeon.blogpool.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String writer;

    @Column(name = "post_title", length = 200, nullable = false)
    private String title;

    @Column(name = "post_text", columnDefinition = "TEXT", nullable = false)
    private String mainText;

    @Column(columnDefinition = "integer default 0", nullable = false)
    private Long views;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private List<Comment> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;


}
