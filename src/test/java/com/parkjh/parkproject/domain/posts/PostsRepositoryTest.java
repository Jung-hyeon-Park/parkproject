package com.parkjh.parkproject.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    /* @After
    public void cleanUp() {
        postsRepository.deleteAll();
    } */

    @Test
    public void getBoardSave() {
        String title = "테스트 게시글 제목";
        String content = "테스트 게시글 본문";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("test@gmail.com")
                .regDate(LocalDateTime.now())
                .build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }
}
