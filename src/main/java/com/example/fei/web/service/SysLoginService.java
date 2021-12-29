package com.example.fei.web.service;

import org.springframework.stereotype.Component;

@Component
public class SysLoginService {

    /**
     * 登录验证
     * @param username 用户名
     * @param password 密码
     * @param code 验证码
     * @param uuid 唯一标志
     * @return 结果
     */
    public String login(String username, String password, String code, String uuid) {
         // todo:生成 token
        return "xxx";
    }
}
