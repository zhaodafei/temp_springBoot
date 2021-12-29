package com.example.fei.web.controller.system;

import com.example.fei.web.controller.common.constant.Constants;
import com.example.fei.web.controller.common.core.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysIndexController {
    /**
     * 访问首页
     */
    @RequestMapping("/")
    public String index()
    {
        return "hello world index";
    }

    /**
     * Api接口测试
     *   http://localhost:8080/apiFei
     *      GET 无参数
     */
    @GetMapping("/apiFei")
    public AjaxResult index2() {
        AjaxResult ajax =  AjaxResult.success();
        ajax.put(Constants.TOKEN, "ok_访问成功");
        return ajax;
    }


}
