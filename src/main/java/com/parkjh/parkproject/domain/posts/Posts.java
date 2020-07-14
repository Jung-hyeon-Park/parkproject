package com.parkjh.parkproject.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Column(nullable = false)
    private LocalDateTime regDate;

    private LocalDateTime updDate;

    @Column(nullable = false, columnDefinition = " varchar(1) default 'N'")
    private char delYn;

    @Builder
    public Posts(String title, String content, String author, LocalDateTime regDate) {

        this.title = title;
        this.content = content;
        this.author = author;
        this.regDate = regDate;
    }

    public void update(String title, String content, LocalDateTime updDate) {

        this.title = title;
        this.content = content;
        this.updDate = updDate;
    }
}
