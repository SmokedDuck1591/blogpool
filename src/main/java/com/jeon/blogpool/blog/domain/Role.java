package com.jeon.blogpool.blog.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {
    GUEST,
    FRIEND,
    ADMIN
}
