package com.lt.client;

import com.lt.common.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @Author LT
 * @create 2021-02-23 9:57
 */
/*@FeignClient(name = "provide-nacos-service", fallback = userClientImpl.class)*///继承时写入异常
@FeignClient(name = "provide-nacos-service")//自定义配置sentinel
public interface userClient {
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    Result hello(@RequestParam String name);
}
