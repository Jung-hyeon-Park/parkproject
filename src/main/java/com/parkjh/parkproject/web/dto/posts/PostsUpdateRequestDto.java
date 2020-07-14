package com.parkjh.parkproject.web.dto.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String title;
    private String content;
    private LocalDateTime updDate;

    @Builder
    public PostsUpdateRequestDto(String title, String content, LocalDateTime updDate) {

        this.title = title;
        this.content = content;
        this.updDate = updDate;
    }
}
