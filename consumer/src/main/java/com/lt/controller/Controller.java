package com.lt.controller;

import com.lt.client.userClient;
import com.lt.common.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LT
 * @create 2021-02-23 10:08
 */
@RestController
public class Controller {
    @Autowired
    private userClient userClient;


    //测试
    @RequestMapping(value = "/hello-customer",method = RequestMethod.POST)
    public Result hello() {
        String text="8002调用,"+userClient.hello().getData();
        return Result.SUCCESS(text);
    }
}
