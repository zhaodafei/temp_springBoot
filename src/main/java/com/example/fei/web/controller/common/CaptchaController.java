package com.example.fei.web.controller.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptchaController {

    /**
     * 生成验证码
     */
    @GetMapping("/captchaImage")
    public String index()
    {
        return "hello world index";
    }
}
