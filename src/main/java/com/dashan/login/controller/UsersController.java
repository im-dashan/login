package com.dashan.login.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dashan.login.constants.OpenApiConstants.HELLO;

@Tag(name = "用户登录注册", description = "处理用户登录注册功能")
@RestController
@RequestMapping("/api/auth")
public class UsersController {

    @PostMapping("/login")
    @Operation(summary = "用户登录", description = "通过用户名和密码登录")
    public String login() {
        return HELLO;
    }

    @PostMapping("/register")
    @Operation(summary = "用户注册", description = "通过邮箱验证注册账号")
    public String register() {
        return HELLO;
    }
}
