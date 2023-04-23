package com.jeon.blogpool.blog.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment_text", columnDefinition = "TEXT", nullable = false)
    private String mainText;

    @Column(name = "create_date")
    private String createDate;

    @Column(name = "modified", columnDefinition = "boolean default false")
    private boolean isModified;

    @ManyToOne()
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
