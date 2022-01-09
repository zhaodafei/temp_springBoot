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

import java.util.HashMap;
import java.util.Map;

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
     * 测试
     * @return {"msg":"自定义信息","code":"200","id":"1"}
     */
    @RequestMapping("/feiJson")
    public Map<String, String> index2()
    {
        return new HashMap<String, String>() {{
            put("code", "200");
            put("id", "1");
            put("msg", "自定义信息");
        }};
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

    /**
     * 访问首页
     * http://localhost:8080/selectTwo
     */
    @RequestMapping("/select02")
    public AjaxResult selectUserTwo() {
        AjaxResult ajax = AjaxResult.success();
        JSONObject object = new JSONObject();
        object.put("name", "fei");
        object.put("age", 18);

        User user = userService.selectUserTwo(2);

        ajax.put(AjaxResult.DATA_TAG, user);
        ajax.put("foo", "自定义数据");
        ajax.put("bar", object);

        return ajax;
    }

    @RequestMapping("/select03")
    public AjaxResult selectUserThree() {
        AjaxResult ajax = AjaxResult.success();

        User user = userService.selectUserThree(3);

        ajax.put(AjaxResult.DATA_TAG, user);

        return ajax;
    }

    @RequestMapping("/select04")
    public AjaxResult selectUserFour() {
        AjaxResult ajax = AjaxResult.success();

        // fei_tip: 模拟查询条件
        User userDomain = new User();
        userDomain.setId(4);
        userDomain.setUsername("dafei_04");

        User user = userService.selectUserFour(userDomain);

        ajax.put(AjaxResult.DATA_TAG, user);

        return ajax;
    }

    @RequestMapping("/select05")
    public AjaxResult selectUserFive() {
        AjaxResult ajax = AjaxResult.success();

        // fei_tip: 模拟查询条件
        User userDomain = new User();
        userDomain.setId(5);
        userDomain.setUsername("dafei_05");

        User user = userService.selectUserFive(userDomain);

        ajax.put(AjaxResult.DATA_TAG, user);

        return ajax;
    }
}
