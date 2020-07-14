package com.parkjh.parkproject.web.dto.posts;

import com.parkjh.parkproject.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime regDate;
    private LocalDateTime updDate;

    public PostsResponseDto(Posts entity) {

        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.regDate = entity.getRegDate();
        this.updDate = entity.getUpdDate();
    }
}
