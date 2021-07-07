package com.portfolio.one.springboot.web.dto;

import com.portfolio.one.springboot.domain.posts.Posts;
import lombok.Getter;

import java.security.PrivateKey;
import java.util.PrimitiveIterator;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
