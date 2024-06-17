package com.dashan.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dashan.login.constants.OpenApiConstants.*;

@RestController
@RequestMapping("/api")
public class OpenApiController {

    @GetMapping("/hello")
    public String hello() {
        return HELLO;
    }
}