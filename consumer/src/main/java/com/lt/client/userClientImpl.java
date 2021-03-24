package com.lt.client;

import com.lt.common.response.Result;
import org.springframework.stereotype.Component;

/**
 * @Author LT
 * @create 2021-03-16 15:34
 */
/*@Component*/
public class userClientImpl implements userClient {
    /*接受熔断，错误进入这里*/
    @Override
    public Result hello(String name) {
        return Result.FAIL("服务器暂时连接不上");
    }
}
