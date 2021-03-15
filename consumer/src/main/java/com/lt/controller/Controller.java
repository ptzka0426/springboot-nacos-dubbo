package com.lt.controller;

import com.lt.client.userClient;
import com.lt.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LT
 * @create 2021-02-23 10:08
 */
@RestController
@Scope("prototype")
@Api(tags = "消费者")
public class Controller {
    @Autowired
    private userClient userClient;


    //测试
    @ApiImplicitParam(name = "name", required = true)
    @ApiOperation(value = "握手成功！")
    @RequestMapping(value = "/hello-customer",method = RequestMethod.POST)
    public ResponseEntity<String> hello(@RequestParam(value = "name") String name) {
        String text="8002调用,"+userClient.hello().getData();
        return ResponseEntity.ok("8002");
    }
}
