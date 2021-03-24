package com.lt.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.lt.client.userClient;
import com.lt.client.userClientImpl;
import com.lt.common.response.Result;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
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
    //@SentinelResource(value = "hello-customer", blockHandler = "selectProductByIdFallback")
    @SentinelResource(value = "hello-customer", blockHandler = "selectProductByIdFallback")
    @RequestMapping(value = "/hello-customer", method = RequestMethod.POST)
    public Result hellos(@RequestParam(value = "name") String name) {
        System.out.println(userClient.hello(name).getMessage());
        userClient.hello(name);
        return Result.SUCCESS("8002 调用");
    }

    public Result selectProductByIdFallback(String name, BlockException exception) {
        System.out.println("product-service 服务的 selectProductById 方法出现异常，异常信息如下：" + exception);
        return Result.FAIL("服务熔断降级处理-托底数据");
    }
}
