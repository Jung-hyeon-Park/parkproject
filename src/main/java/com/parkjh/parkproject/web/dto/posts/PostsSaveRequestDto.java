package com.parkjh.parkproject.web.dto.posts;

import com.parkjh.parkproject.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    private LocalDateTime regDate;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author, LocalDateTime regDate) {

        this.title = title;
        this.content = content;
        this.author = author;
        this.regDate = regDate;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .regDate(regDate)
                .build();
    }
}
