package com.parkjh.parkproject.web.dao;

import com.parkjh.parkproject.web.dto.HomeResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HomeResponseDtoTest {

    @Test
    public void lombokTest() {

        String name = "test";
        int amount = 1000;

        HomeResponseDto homeDto = new HomeResponseDto(name, amount);

        assertThat(homeDto.getName()).isEqualTo(name);
        assertThat(homeDto.getAmount()).isEqualTo(amount);
    }
}
