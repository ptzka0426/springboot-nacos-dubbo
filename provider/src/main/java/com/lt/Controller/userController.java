package com.lt.Controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.lt.Entity.user;
import com.lt.Server.br_user_server;
import com.lt.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Author LT
 * @create 2021-02-23 9:49
 */
@RestController
@Scope("prototype")
@Api(tags = "提供者")
public class userController {
    @Autowired
    private br_user_server br_user_server;

    @ApiOperationSupport(author = "LONGTAO")
    @ApiImplicitParam(name = "name", required = true)
    @ApiOperation(value = "握手成功！")
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public Result hello(@RequestParam(value = "name") String name) {
        System.out.println("8001");
        return Result.SUCCESS("8001"+name);
    }

    @ApiOperation(value = "新增Model接口1")
    @ApiOperationSupport(ignoreParameters = {"id","orderDate.id"})
    @RequestMapping(value = "/hello1", method = RequestMethod.POST)
    public user insertModel1(@RequestBody user user){
        return user;
    }
}
