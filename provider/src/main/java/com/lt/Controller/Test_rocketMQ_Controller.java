package com.lt.Controller;

import com.lt.Entity.user;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author LT
 * @create 2021-04-13 9:31
 */
@RestController
@RequestMapping("rocketmq")
public class Test_rocketMQ_Controller {
/*    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    @GetMapping("/test")
    public String test(String msg) {
        user testMessaging = new user();
        testMessaging.setId(1111);
        testMessaging.setNumber(msg);
        rocketMQTemplate.convertAndSend("add-bonus", testMessaging);
        return "投递消息 => " + msg + " => 成功";
    }*/
}
