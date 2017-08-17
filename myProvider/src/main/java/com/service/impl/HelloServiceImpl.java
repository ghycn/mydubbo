package com.service.impl;

import com.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public String speakHello(String name) {
        return "你好：" + name;
    }
}
