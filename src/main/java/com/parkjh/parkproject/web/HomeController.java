package com.parkjh.parkproject.web;

import com.parkjh.parkproject.web.dto.HomeResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/homeDto")
    public HomeResponseDto homeDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HomeResponseDto(name, amount);
    }
}
