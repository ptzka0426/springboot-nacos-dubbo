package com.lt.client;

import com.lt.common.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author LT
 * @create 2021-02-23 9:57
 */
@FeignClient(name = "provide-nacos-service")
public interface userClient {
    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    Result hello();
}
