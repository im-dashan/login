package com.dashan.login.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dashan.login.constants.OpenApiConstants.*;

@RestController
@RequestMapping("/api/swagger")
@Tag(name = "Swagger测试", description = "测试API，可以忽略")
public class OpenApiController {

    @GetMapping("/hello")
    public String hello() {
        return HELLO;
    }
}
流口水出栏撒出可能是阿珂才能上课啊