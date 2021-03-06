package com.parkjh.parkproject.service.posts;

import com.parkjh.parkproject.domain.posts.Posts;
import com.parkjh.parkproject.domain.posts.PostsRepository;
import com.parkjh.parkproject.web.dto.posts.PostsResponseDto;
import com.parkjh.parkproject.web.dto.posts.PostsSaveRequestDto;
import com.parkjh.parkproject.web.dto.posts.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {

        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto) {

        Posts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. Id = " + id));

        posts.update(requestDto.getTitle(), requestDto.getContent(), requestDto.getUpdDate());

        return id;
    }

    public PostsResponseDto findById(Long id) {

        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. Id = " + id));

        return new PostsResponseDto(entity);
    }
}
