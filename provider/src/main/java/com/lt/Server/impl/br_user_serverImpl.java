package com.lt.Server.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lt.Entity.user;
import com.lt.Mapper.br_user_Mapper;
import com.lt.Server.br_user_server;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.stereotype.Service;

import java.security.Provider;

/**
 * @Author LT
 * @create 2021-02-23 9:39
 */
@Service
@AutoConfigureAfter({br_user_Mapper.class})
public class br_user_serverImpl extends ServiceImpl<br_user_Mapper, user> implements br_user_server {
}
