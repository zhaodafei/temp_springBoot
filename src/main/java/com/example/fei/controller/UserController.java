package com.example.fei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.fei.common.core.AjaxResult;
import com.example.fei.common.utils.StringUtils;
import com.example.fei.domain.User;
import com.example.fei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 访问首页
     */
    @RequestMapping("/")
    public String index()
    {
        return "hello world index";
    }

    /**
     * 访问首页
     * http://localhost:8080/select
     */
    @RequestMapping("/select")
    public AjaxResult selectUser() {
        AjaxResult ajax = AjaxResult.success();
        JSONObject object = new JSONObject();
        object.put("name", "fei");
        object.put("age", 18);

        User user = userService.selectUser(1);

        ajax.put(AjaxResult.DATA_TAG, user);
        ajax.put("foo", "自定义数据");
        ajax.put("bar", object);

        return ajax;
    }
}
