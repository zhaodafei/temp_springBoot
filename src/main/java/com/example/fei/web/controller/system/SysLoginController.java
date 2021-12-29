package com.example.fei.web.controller.system;

import com.example.fei.web.controller.common.constant.Constants;
import com.example.fei.web.controller.common.core.AjaxResult;
import com.example.fei.web.controller.common.core.model.LoginBody;
import com.example.fei.web.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysLoginController {

    @Autowired
    private SysLoginService loginService;

    /**
     * 登录方法
     * http://localhost:8080/login
     *     {"username": "fei", "password": "123456", "code": "1231", "uuid": "123456"}
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBody loginBody)
    {
        AjaxResult ajax =  AjaxResult.success();
        // 生成令牌
        String token = loginService.login(loginBody.getUsername(), loginBody.getPassword(), loginBody.getCode(),
                loginBody.getUuid());

        ajax.put(Constants.TOKEN, token);
        return ajax;
    }
}
