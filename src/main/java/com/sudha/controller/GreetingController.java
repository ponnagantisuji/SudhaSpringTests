package com.sudha.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class GreetingController {

    @GetMapping("/greet/{name}")
    public String greet(
            @PathVariable String name,
            @RequestParam(value = "title", defaultValue = "Mrs.") String title) {
        log.info("Greeting request received for name: {} and title: {}", name, title);
        return "Hello, " + title + " " + name;
    }
}
