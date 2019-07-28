package com.example01.control;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example01.entity.User;
import com.example01.service.ProviderService_1;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 杨军
 * @version 1.0
 * @date 2019/07/26 0026 下午 08:57
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Reference
    private ProviderService_1 service;

    @RequestMapping("/start")
    public String testMethod() {
        String method = service.firstMethod();
        return method;
    }

    @RequestMapping("/find")
    public List<User> find() {
        List<User> list = service.findAll();
        System.out.println(list);
        return list;
    }
}
