package com.lt.Controller;

import com.lt.Server.br_user_server;
import com.lt.common.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LT
 * @create 2021-02-23 9:49
 */
@RestController
public class userController {
    @Autowired
    private br_user_server br_user_server;

    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public Result hello() {
        System.out.println("8001");
        return Result.SUCCESS("8001");
    }
}
