package com.lt.Controller;

import cn.dev33.satoken.stp.StpUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author LT
 * @create 2021-04-01 9:37
 */

@RestController
@RequestMapping("user")
public class usController {
    // 测试   浏览器访问： http://localhost:8081/user/doLogin
    @RequestMapping("doLogin")
    public String test(String username, String password) {
        if("zhang".equals(username) && "123456".equals(password)) {
            StpUtil.setLoginId(10001);
            return "登录成功";
        }
        return "登录失败";
    }
}
